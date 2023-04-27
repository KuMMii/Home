package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.MemberDto;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="member/loginForm.jsp";
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser")!=null) {
			url="main.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String userid=request.getParameter("userid");
		String pwd=request.getParameter("pwd");
		
		String url="member/loginForm.jsp";
		
		MemberDao mdao=MemberDao.getInstance();
		MemberDto mdto=mdao.getMember(userid);
		
		if(mdto==null) {
			request.setAttribute("message", "No ID");
		}else if(mdto.getPwd()==null) {
			request.setAttribute("message", "DB Error. Please contact to the Admin");
		}else if(!mdto.getPwd().equals(pwd)) {
			request.setAttribute("message", "Wrong password");
		}else if(mdto.getPwd().equals(pwd)) {
			url="member/main.jsp";
			
			HttpSession session=request.getSession();
			session.setAttribute("loginUser", mdto);
		}else {
			request.setAttribute("message", "Error with no reason. Please contact to the Admin");
		}
	RequestDispatcher dp=request.getRequestDispatcher(url);
	dp.forward(request, response);
		
	}

}
