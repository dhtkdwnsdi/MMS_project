package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.project.ProjectApplyFormAction;
import com.mms.controller.action.project.ProjectApplyListFormAction;
import com.mms.controller.action.project.ProjectApplyViewFormAction;
import com.mms.controller.action.project.ProjectDeleteAction;
import com.mms.controller.action.project.ProjectRegisterListFormAction;
import com.mms.controller.action.project.ProjectRegisterAction;
import com.mms.controller.action.project.ProjectUpdateAction;
import com.mms.controller.action.project.ProjectUpdateFormAction;
import com.mms.controller.action.project.ProjectRegisterViewFormAction;

public class ProjectActionFactory {

		private static ProjectActionFactory instance = new ProjectActionFactory();

		private ProjectActionFactory() {
			super();
		}

		public static ProjectActionFactory getInstance() {
			return instance;
		}
		
		public Action getAction(String command) {
			Action action = null;

			System.out.println("ActionFactory : " + command);
			
			if(command.equals("projectRegisterListForm")) {
				action = new ProjectRegisterListFormAction();
			}
			else if(command.equals("projectRegister")) {
				action = new ProjectRegisterAction();
				
			}
			else if(command.equals("projectRegisterViewForm")) {
				action = new ProjectRegisterViewFormAction();
				
			}
			else if(command.equals("projectUpdateForm")) {
				action = new ProjectUpdateFormAction();
			}
			else if(command.equals("projectUpdate")) {
				action = new ProjectUpdateAction();
				
			}
			else if(command.equals("projectDelete")) {
				action = new ProjectDeleteAction();
				
			}
			else if(command.equals("projectApplyListForm")) {
				action = new ProjectApplyListFormAction();
				
			}
			else if(command.equals("projectApplyViewForm")) {
				action = new ProjectApplyViewFormAction();
				
			}
			else if(command.equals("projectApplyFormAction")) {
				action = new ProjectApplyFormAction();
				
			}
			return action;
		}
		

}
