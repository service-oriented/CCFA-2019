package hudala.mvc.controller.user;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import hudala.mvc.model.bean.Account;
import hudala.mvc.model.bean.FeedBack;
import hudala.mvc.model.bean.Guest;
import hudala.mvc.model.dao.ConnectionPool;
import hudala.mvc.model.dao.ConnectionPoolImpl;
import hudala.mvc.model.service.FeedBackService;
import hudala.mvc.model.service.GuestService;
import hudala.mvc.util.SessionUtil;

/**
 * Servlet implementation class phanhoi
 */
@WebServlet("/phanhoi")
public class phanhoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConnectionPool cp = new ConnectionPoolImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public phanhoi() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Account account = new Account();
		account = (Account) SessionUtil.getInstance().getValue(request, "ACCOUNT");
		if(account!=null) {
			Guest guest=new Guest(null, null, null, false, null, null, null);
			guest= new GuestService(cp).getGuest(account.getAccountId()).get(0);
			session.setAttribute("GUEST1", guest);
		}
		RequestDispatcher rd=request.getRequestDispatcher("/views/web/feedback.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		HttpSession session = request.getSession();
		Account account = new Account();
		account = (Account) SessionUtil.getInstance().getValue(request, "ACCOUNT");
		long accountId=0;
		if (account==null)	{
			System.out.println("Ban chua dang nhap");
			response.sendRedirect(request.getContextPath()+"/phanhoi");
		}
		else {
			accountId=account.getAccountId();
			System.out.println("Tài khoản ID là:"+accountId);
		if (action != null && action.equals("feedback")) {
			
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			FeedBackService feedBackService=new FeedBackService(cp);
			
			FeedBack feedback=new FeedBack(null,null);
			feedback.setContent(content);
			feedback.setTitle(title);
			feedback.setSender(accountId);			
			feedback.setSentTime(new Timestamp(System.currentTimeMillis()));
			
			System.out.println("Thời gian: "+feedback.getSentTime());
			
			feedBackService.addFeedBack(feedback);
				
			System.out.println("Them thanh cong");
			response.sendRedirect(request.getContextPath()+"/phanhoi");	
		}
		else {
			System.out.println("Khong them duoc cau hoi");
			}
		}
	
	}

}
