package hudala.mvc.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hudala.mvc.model.bean.Account;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.service.AccountService;
import hudala.mvc.util.MD5;

@WebServlet("/admin")
public class LoginController extends HttpServlet {
	ConnectionPool cp;
	/**
	 * 
	 */
	private static final long serialVersionUID = -3085463396405771181L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/login.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		//String password = MD5.encode(req.getParameter("password"));// ma hoa mat khau
		
		String password = MD5.encode(req.getParameter("password"));
		AccountService accountService = new AccountService(cp);
		if (cp == null) {
			getServletContext().setAttribute("CPool", accountService.getCP());
		}
		Account account = accountService.getAdminAccount();
		if(account.getUsername().equals(username) && account.getPassword().equals(password)) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			resp.sendRedirect("/admin/home");
		}else {
			resp.sendRedirect("/admin?login=failure");
		}

	}

}
