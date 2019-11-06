package hudala.mvc.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hudala.mvc.dto.MenuDto;
import hudala.mvc.model.bean.Account;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.service.AccountService;

//@WebServlet("/admin/account")
public class AccountController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (null == session.getAttribute("username")) {
			resp.sendRedirect("/admin");
		} else {
			String action = req.getServletPath();
			switch (action) {
			case "/admin/account":
				showAll(req, resp);
				break;
			case "/admin/account/change-status":
				changeStatusAccount(req, resp);
				break;
			default:
				break;
			}
		}
	}

	private void showAll(HttpServletRequest req, HttpServletResponse resp) {
		ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute("CPool");
		AccountService accountService = new AccountService(cp);
		if (cp == null) {
			getServletContext().setAttribute("CPool", accountService.getCP());
		}
		MenuDto menu = MenuController.getMenu(cp);
		List<Account> listUser = accountService.getAllUserAccount();
		req.setAttribute("menu", menu);
		req.setAttribute("listUser", listUser);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/admin/account.jsp");
		try {
			requestDispatcher.forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void changeStatusAccount(HttpServletRequest req, HttpServletResponse resp) {
		ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute("CPool");
		AccountService accountService = new AccountService(cp);
		if (cp == null) {
			getServletContext().setAttribute("CPool", accountService.getCP());
		}
		long accountId = Long.valueOf(req.getParameter("id"));
		if (req.getParameter("s") != null) {
			boolean status = Boolean.valueOf(req.getParameter("s"));
			accountService.changeStatusAcccount(status, accountId);
		}
		try {
			resp.sendRedirect("/admin/account");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
