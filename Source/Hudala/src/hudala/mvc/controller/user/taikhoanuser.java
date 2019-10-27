package hudala.mvc.controller.user;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
import hudala.mvc.model.service.AccountService;
import hudala.mvc.model.service.GuestService;
import hudala.mvc.model.service.GuestService;
import hudala.mvc.util.SessionUtil;

/**
 * Servlet implementation class trangchu
 */
@WebServlet("/taikhoanuser")
public class taikhoanuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConnectionPool cp = new ConnectionPoolImpl();

	public taikhoanuser() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Account account = new Account();
		account = (Account) SessionUtil.getInstance().getValue(request, "ACCOUNT");

		if (account != null) {
			long accountId = account.getAccountId();
			ArrayList<Guest> guests = new GuestService(cp).getGuest(accountId);

			if (guests.size() != 0) {
				session.setAttribute("GUEST", guests.get(0));
			} else {
				System.out.println("Chưa lấy được thông tin khách hàng");
			}
		} else
			System.out.println("Ko lấy được accountId");

		RequestDispatcher rd = request.getRequestDispatcher("/views/web/userProfile.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		HttpSession session = request.getSession();
		Account account = new Account();
		account = (Account) SessionUtil.getInstance().getValue(request, "ACCOUNT");
		System.out.println("action:" + action);
		if (action != null && action.equals("thoat")) {
			response.sendRedirect(request.getContextPath() + "/trangchu");
		} else {

			GuestService guestModel = new GuestService(cp);
			if (account != null) {
				long accountId = account.getAccountId();
				System.out.println(account.getAccountId());
				Guest guest = guestModel.getGuest(accountId).get(0);
				String fullName = request.getParameter("fullName");
				Timestamp birth = null;
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Date parsedDate = dateFormat.parse(request.getParameter("birth"));
					birth = new Timestamp(parsedDate.getTime());
				} catch (ParseException e) {
					e.printStackTrace();
				}

				String gt = request.getParameter("gender");
				Boolean gender = null;
				if (Integer.parseInt(gt) == 1) {
					gender = true;
				} else if (Integer.parseInt(gt) == 2) {
					gender = false;
				}
				System.out.println(gender);
				float weight = Float.parseFloat(request.getParameter("weight"));
				float height = Float.parseFloat(request.getParameter("height"));
				String phone = request.getParameter("phone");
				System.out.println("sodt" + phone);
				String email = request.getParameter("email");
				System.out.println("email" + email);
				String job = request.getParameter("job");
				String favorite = request.getParameter("favorite");
				String body = request.getParameter("body_1") + request.getParameter("body_2")
						+ request.getParameter("body_3");
				String hairColor = request.getParameter("hairColor");
				String skinColor = request.getParameter("skinColor");
				String faceShape = request.getParameter("faceShape");
				String lipThickness = request.getParameter("lipThickness");
				String image=request.getParameter("Upload photo");
				String link=request.getParameter("link");
				if (fullName != "")
					guest.setFullName(fullName);
				else
					guest.setFullName(null);
				if(image!="") guest.setImage(image);
				else guest.setImage(null);
				guest.setBirth(birth);
				guest.setGender(gender);
				if (weight != 0)
					guest.setWeight(weight);
				else
					guest.setWeight(0);
				if (height != 0)
					guest.setHeight(height);
				else
					guest.setHeight(0);
				if (phone != "")
					guest.setPhone(phone);
				else
					guest.setPhone(null);
				if (link != "")
					guest.setLink(link);
				else
					guest.setLink(null);
				if (email != "")
					guest.setEmail(email);
				else
					guest.setEmail(null);
				if (job != "")
					guest.setJob(job);
				else
					guest.setJob(null);
				if (favorite != "")
					guest.setFavorite(favorite);
				else
					guest.setFavorite(null);
				if (body != "")
					guest.setBody(body);
				else
					guest.setBody(null);
				if (hairColor != "")
					guest.setHairColor(hairColor);
				else
					guest.setHairColor(null);
				if (skinColor != "")
					guest.setSkinColor(skinColor);
				else
					guest.setSkinColor(null);
				if (faceShape != "")
					guest.setFaceShape(faceShape);
				else
					guest.setFaceShape(null);
				if (lipThickness != "")
					guest.setLipThickness(lipThickness);
				else
					guest.setLipThickness(null);
				System.out.println(guest.toString());

				if (action != null && action.equals("userProfile")) {
					if (guestModel.updateGuest(guest))
						System.out.println("Sua thong tin khach hang thanh cong");
					else
						System.out.println("Khong sua duoc thong tin khach hang");
					response.sendRedirect(request.getContextPath() + "/taikhoanuser");

				}

			}
		}
	}

}
