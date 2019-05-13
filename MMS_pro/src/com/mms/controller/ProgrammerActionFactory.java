package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.CareerDeleteAction;
import com.mms.controller.action.CareerListFormAction;
import com.mms.controller.action.CareerRegisterAction;
import com.mms.controller.action.CertListFormAction;
import com.mms.controller.action.CertRegistAction;
import com.mms.controller.action.CertRegistFormAction;
import com.mms.controller.action.CertSearchFormAction;
import com.mms.controller.action.EduDeleteAction;
import com.mms.controller.action.EduListFormAction;
import com.mms.controller.action.EduRegisterAction;
import com.mms.controller.action.MemberSetFormAction;
import com.mms.controller.action.MemberUpdateAction;
import com.mms.controller.action.MyCertDeleteAction;
import com.mms.controller.action.MyCertListFormAction;

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
		else if(command.equals("careerDelete")) {
			action = new CareerDeleteAction();
			
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
		
		else if(command.equals("eduDelete")) {
			action = new EduDeleteAction();
			
		}
		
		
		
		/**
		 * @author OSJ
		 */
		//자격증
		else if(command.equals("certListForm")) {
			action = new CertListFormAction();
		}
		else if(command.equals("certRegistForm")) {
			action = new CertRegistFormAction();
		}
		else if(command.equals("certRegist")) {
			action = new CertRegistAction();
		}
		else if(command.equals("certSearchForm")) {
			action = new CertSearchFormAction();
		}
		
		
		
		//보유 자격증
		else if(command.equals("myCertListForm")) {
			action = new MyCertListFormAction();
		}
		else if(command.equals("myCertDelete")) {
			action = new MyCertDeleteAction();
		}
		
		
		
		
		
		/**
		 * @author LYJ
		 */
		
		
		
		
		
		
		
		
		
		return action;
	}
	
}
