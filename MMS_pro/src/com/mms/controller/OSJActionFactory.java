package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.CertListFormAction;
import com.mms.controller.action.CertRegistAction;
import com.mms.controller.action.CertRegistFormAction;
import com.mms.controller.action.MainAction;
/**
 * @author OSJ
 */
public class OSJActionFactory {
	private static OSJActionFactory instance = new OSJActionFactory();

	private OSJActionFactory() {
		super();
	}

	public static OSJActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;

		System.out.println("ProjectActionFactory : " + command);

		if (command.equals("main")) {

			action = new MainAction();

		} /*
			 * else if(command.equals("projectListForm")) { action = new
			 * projectListFormAction(); }
			 */ else if(command.equals("certListForm")) {
			action = new CertListFormAction();
		} 
			 else if(command.equals("certRegistForm")) {
			action = new CertRegistFormAction();
		} 
			 else if(command.equals("certRegist")) {
			action = new CertRegistAction();
		}
		
		
		
		
		
		
		
		
		
		return action;
	}
}
