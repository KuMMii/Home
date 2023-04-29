package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.MemberDto;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
			url="member.do?command=main";
			
			HttpSession session=request.getSession();
			session.setAttribute("loginUser", mdto);
		}else {
			request.setAttribute("message", "Error with no reason. Please contact to the Admin");
		}
	RequestDispatcher dp=request.getRequestDispatcher(url);
	dp.forward(request, response);
	}

}
