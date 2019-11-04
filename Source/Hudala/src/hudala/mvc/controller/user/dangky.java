package hudala.mvc.controller.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hudala.mvc.model.bean.Account;
import hudala.mvc.model.bean.Guest;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.dao.ConnectionPoolImpl;
import hudala.mvc.model.service.AccountService;
import hudala.mvc.model.service.GuestService;
import hudala.mvc.util.MD5;


/**
 * Servlet implementation class dangky
 */
@WebServlet("/dangky")
public class dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConnectionPool cp = new ConnectionPoolImpl() ;
    public dangky() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");//chi khi dang nhap moi co
		if (action != null && action.equals("signup")) {		
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/signup.jsp");
			rd.forward(request, response);
		} else  {			
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String fullname=request.getParameter("fullname");
		String username=request.getParameter("username");
		String password = MD5.encode(request.getParameter("password"));
		String password2 = MD5.encode(request.getParameter("password2"));		
		System.out.println(fullname);
		System.out.println(username);
		System.out.println(password);
		System.out.println(password2);
		AccountService accountmodel=new AccountService(cp);
		GuestService guestmodel=new GuestService(cp);
		Account account=new Account();
		Guest guest=new Guest(null, null, null, true, null, null, null)	;	
		
		if(accountmodel.checkUsername(username)==true) {
			System.out.println("Ten dang nhap da ton tai");
			response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
		}
		else if(password.compareTo(password2)!=0) {
			System.out.println("Mat khau khong chinh xac");
			response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
		}
		else {			
			account.setUsername(username);
			account.setPassword(password);
			account.setStatus(true);
			account.setRole(false);												
			if(accountmodel.addAccount(account)) {
				System.out.println("Them account thanh cong");
				long accountId=accountmodel.getAccountId(username, password);
				if(accountId!=0)
				{
					guest.setFullName(fullname);
					guest.setAccountId(accountId);
					boolean checkGuest=guestmodel.addGuest(guest);
					if(checkGuest==true) {
						HttpSession session=request.getSession();
						session.setAttribute("ACCOUNT", account);
						response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
					}
					else response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
				}			
				else System.out.println("Không them duoc khach hang do da ton tai");
			}		
		
		}					
				
	}

}
