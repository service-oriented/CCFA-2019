package hudala.mvc.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import hudala.mvc.model.bean.Guest;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.service.GuestService;

@WebServlet("/admin/api/user-info")
public class AjaxUserInfo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ConnectionPool cp = (ConnectionPool) getServletContext().getAttribute("CPool");
		GuestService guestService = new GuestService(cp);
		if (cp == null) {
			getServletContext().setAttribute("CPool", guestService.getCP());
		}
		long accountId = Long.parseLong(request.getParameter("id"));
		Gson gson = new Gson();
		Guest guest = guestService.getUserInfo(accountId);
		String guestJson = gson.toJson(guest);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(guestJson);
		out.flush();
	}

}
