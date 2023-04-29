package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.MemberDto;

public class DeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDto mdto = (MemberDto)session.getAttribute("loginUser");
		
		MemberDao mdao = MemberDao.getInstance();
		int result=mdao.deleteMember(mdto.getUserid());
		
		if(result==1) {
			session.invalidate();
			request.setAttribute("message", "Goodbye");
		}
		RequestDispatcher dp = request.getRequestDispatcher("member/loginForm.jsp");
		dp.forward(request, response);
	}

}
