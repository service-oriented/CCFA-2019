package hudala.mvc.controller.user;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import hudala.mvc.model.bean.Account;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.dao.ConnectionPoolImpl;
import hudala.mvc.model.service.AccountService;
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

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");//chi khi dang nhap moi co
		if (action != null && action.equals("login")) {			
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
			rd.forward(request, response);
		}
		 else {			
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=MD5.encode(request.getParameter("password"));	
		HttpSession session=request.getSession();
		System.out.println(username+" "+ password);
		
		
		if(username=="") {
			session.setAttribute("message", "Bạn chưa nhập tên đăng nhập");
			response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
		}
		else if(username.indexOf(" ")!=-1)
		{
			session.setAttribute("message", "Tên đăng nhập có dấu cách");
			response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
		}
		else if(password=="") {
			session.setAttribute("message", "Bạn chưa nhập mật khẩu");
			response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
		}
		else if(new AccountService(cp).checkAccount(username, password, true,false)) {		
			Account account =new AccountService(cp).getAccount(username, password);	
			session.setAttribute("ACCOUNT", account);
			session.setAttribute("message", null);
			response.sendRedirect(request.getContextPath()+"/trangchu");
			
		}
		else {	
			session.setAttribute("message", "Tài khoản không tồn tại");
			response.sendRedirect(request.getContextPath()+"/dang-nhap?action=login");
		}
		
	}

}
