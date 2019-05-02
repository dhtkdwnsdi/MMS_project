package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.LoginAction;
import com.mms.controller.action.MainAction;
import com.mms.controller.action.SignUpAction;
import com.mms.controller.action.careerFormAction;

/**
 * 
 * @author LEE HAN
 *
 */
public class LhActionFactory {
	private static LhActionFactory instance = new LhActionFactory();

	private LhActionFactory() {
		super();
	}

	public static LhActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;

		System.out.println("ActionFactory : " + command);

		if (command.equals("main")) {

			action = new MainAction();

		} 
		
		else if(command.equals("careerForm")) {
			action = new careerFormAction();
		}
		else if(command.equals("signUp")) {
			action = new SignUpAction();
		}
		else if(command.equals("login")) {
			action = new LoginAction();
		}
		
		
		return action;
	}
	
}
