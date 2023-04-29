package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

public class EditAdminAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String admin = request.getParameter("admin");
		if(admin.equals("1")) admin="0";
		else admin="1";
		
		MemberDao mdao=MemberDao.getInstance();
		mdao.editAdmin(userid,admin);
		
		RequestDispatcher dp =request.getRequestDispatcher("member.do?command=main");
		dp.forward(request, response);
	}

}
