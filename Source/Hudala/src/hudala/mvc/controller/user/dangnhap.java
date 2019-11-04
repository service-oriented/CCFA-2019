package hudala.mvc.controller.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
 * Servlet implementation class dangnhap
 */
@WebServlet(name = "dang-nhap", urlPatterns = { "/dang-nhap" })
public class dangnhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConnectionPool cp = new ConnectionPoolImpl() ;
    public dangnhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");//chi khi dang nhap moi co
		if (action != null && action.equals("login")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
			rd.forward(request, response);
		}else if (action != null && action.equals("signup")) {		
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/signup.jsp");
			rd.forward(request, response);
		}
		 else {			
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");	
		String password = MD5.encode(request.getParameter("password"));
		Account account =new AccountService(cp).getAccount(username, password);		
		System.out.println(account);
		
		if(new AccountService(cp).checkAccount(username, password, true,false)) {
		
			HttpSession session=request.getSession();
			session.setAttribute("ACCOUNT", account);				
			
			session.setAttribute("message", null);	
			response.sendRedirect(request.getContextPath()+"/trangchu");
			//response.sendRedirect("/views/web/home.jsp");
		}
		else {
			System.out.println("Loi dang nhap, dang nhap lai");
			HttpSession session=request.getSession();
			session.setAttribute("message", "Tài khoản không tồn tại");			
			response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
		}
		
	}

}
