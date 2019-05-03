package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.MemberSetFormAction;

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
		
		
		
		
		
		
		
		/**
		 * @author PJH
		 */
		
		
		
		
		
		
		
		
		/**
		 * @author OSJ
		 */
		
		
		
		
		
		
		
		
		/**
		 * @author LYJ
		 */
		
		
		
		
		
		
		
		
		
		return action;
	}
	
}
