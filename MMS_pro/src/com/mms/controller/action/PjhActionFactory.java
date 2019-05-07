package com.mms.controller.action;

import com.mms.controller.action.Action;
import com.mms.controller.action.EduAction;
import com.mms.controller.action.MainAction;


/**
 * request로 받아온 매개변수의 command의 값으로 각 기능을 수행할 액션을 분기하는 클래스 <br>
 * action추가 시 최대한 기능별로 정렬될 수 있도록 한다. 수정이 잦은 class이므로 주의하여 편집!!
 * 
 * @author cho
 *
 */

public class PjhActionFactory {
	private static PjhActionFactory instance = new PjhActionFactory();

	private PjhActionFactory() {
		super();
	}

	public static PjhActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;

		System.out.println("PjhActionFactory : " + command);

		if (command.equals("main")) {

			action = new MainAction();

		} 
	
		
		else if(command.equals("edu")) {
			action = new EduAction();
		}
		
		
		
		/**
		 * @author park joo hee
		 */
		
		
		
		
		
		
		
		return action;
	}

}
