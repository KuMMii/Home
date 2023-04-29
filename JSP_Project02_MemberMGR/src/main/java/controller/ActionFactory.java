package controller;

import controller.action.Action;
import controller.action.DeleteAction;
import controller.action.EditAdminAction;
import controller.action.IdCheckAction;
import controller.action.JoinAction;
import controller.action.JoinFormAction;
import controller.action.LoginAction;
import controller.action.LoginFormAction;
import controller.action.LogoutAction;
import controller.action.MainAction;
import controller.action.UpdateAction;
import controller.action.UpdateFormAction;

public class ActionFactory {
	private ActionFactory() {};
	private static ActionFactory itc=new ActionFactory();
	public static ActionFactory getInstance() {return itc;}
	public Action getAction(String command) {
		Action ac=null;
		
		if(command.equals("loginForm")) {
			ac=new LoginFormAction();
		}else if(command.equals("logout")) {
			ac=new LogoutAction();
		}else if(command.equals("main")) {
			ac=new MainAction();
		}else if(command.equals("login")) {
			ac=new LoginAction();
		}else if(command.equals("joinForm")) {
			ac=new JoinFormAction();
		}else if(command.equals("join")) {
			ac=new JoinAction();
		}else if(command.equals("idcheck")) {
			ac=new IdCheckAction();
		}else if(command.equals("updateForm")) {
			ac=new UpdateFormAction();
		}else if(command.equals("update")) {
			ac=new UpdateAction();
		}else if(command.equals("delete")) {
			ac=new DeleteAction();
		}else if(command.equals("editadmin")) {
			ac=new EditAdminAction();
		}else if(command.equals("update")) {
			ac=new UpdateAction();
		}
		
		
		return ac;
	}
	
	

}
