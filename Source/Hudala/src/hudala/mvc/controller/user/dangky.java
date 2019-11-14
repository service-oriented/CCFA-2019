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
import hudala.mvc.util.SessionUtil;


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
		String password=MD5.encode(request.getParameter("password"));
		String password2=MD5.encode(request.getParameter("password2"));	
		
		HttpSession session = request.getSession();
		AccountService accountmodel=new AccountService(cp);
		GuestService guestmodel=new GuestService(cp);
		Account account=new Account();
		Guest guest=new Guest(null, null, null, true, null, null, null)	;	
		
		if(fullname==""||username==""||password=="") {
			session.setAttribute("messSign","Một trường dữ liệu còn trống");
			response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
		}
		
		else if(username.indexOf(" ")!=-1)
		{
			session.setAttribute("messSign", "Tên đăng nhập có dấu cách");
			response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
		}
		else if(password.compareTo(password2)!=0) {
			session.setAttribute("messSign", "Mật khẩu không chính xác");
			response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
		}
		else if(accountmodel.checkUsername(username)==true) {
			session.setAttribute("messSign","Tên đăng nhập đã tồn tại");
			response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
		}		
		else {			
			account.setUsername(username);
			account.setPassword(password);
			account.setStatus(true);
			account.setRole(false);												
			if(accountmodel.addAccount(account)) {
				long accountId=accountmodel.getAccountId(username, password);
				if(accountId!=0)
				{
					guest.setFullName(fullname);
					guest.setAccountId(accountId);
					boolean checkGuest=guestmodel.addGuest(guest);
					if(checkGuest==true) {
						session.setAttribute("ACCOUNT", account);
						SessionUtil.getInstance().removeValue(request, "messSign");
						response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
					}
					else response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
				}			
				else {
					session.setAttribute("messSign","Khách hàng đã tồn tại");
					response.sendRedirect(request.getContextPath()+"/dangky?action=signup");
				}
			}		
		
		}					
				
	}

}
