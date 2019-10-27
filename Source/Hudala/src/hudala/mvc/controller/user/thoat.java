package hudala.mvc.controller.user;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hudala.mvc.util.SessionUtil;

/**
 * Servlet implementation class thoat
 */
@WebServlet("/thoat")
public class thoat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public thoat() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "ACCOUNT");
			response.sendRedirect(request.getContextPath()+"/trangchu");
		}
		else if (action != null && action.equals("logoutUser")) {
			response.sendRedirect(request.getContextPath()+"/trangchu");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("message", "");
		session.setAttribute("alert","");
	}

}
