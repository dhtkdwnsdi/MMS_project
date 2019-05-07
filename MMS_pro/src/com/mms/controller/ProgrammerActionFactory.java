package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.CareerListFormAction;
import com.mms.controller.action.CareerRegisterAction;
import com.mms.controller.action.EduListFormAction;
import com.mms.controller.action.EduRegisterAction;
import com.mms.controller.action.MemberSetFormAction;
import com.mms.controller.action.MemberUpdateAction;

public class ProgrammerActionFactory {
	private static ProgrammerActionFactory instance = new ProgrammerActionFactory();
	
	private ProgrammerActionFactory() {
		super();
	}
	
	public static ProgrammerActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		
		System.out.println("ProgrammerActionFactory : " + command);
		
		
		/**
		 * @author LEE HAN
		 */
		if(command.equals("memberSetForm")) {
			action = new MemberSetFormAction();
			
		}
		else if (command.equals("memberUpdate")) {
			action = new MemberUpdateAction();
			
		}
		else if(command.equals("careerListForm")) {
			action = new CareerListFormAction();
			
		}
		else if(command.equals("careerRegister")) {
			action = new CareerRegisterAction();
			
		}

		
		
		
		
		
		
		/**
		 * @author PJH
		 */
		
		
		else if(command.equals("eduListForm")) {
			action = new EduListFormAction();
		}
		
		else if(command.equals("eduRegister")) {
			action = new EduRegisterAction();
			
		}
		
		
		
		/**
		 * @author OSJ
		 */
		
		
		
		
		
		
		
		/**
		 * @author LYJ
		 */
		
		
		
		
		
		
		
		
		
		return action;
	}
	
}
