package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.MainAction;
import com.mms.controller.action.careerFormAction;
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

		} else if(command.equals("projectListForm")) {
			action = new careerFormAction();
		}
		
		
		
		
		
		
		
		
		
		return action;
	}
}
