package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.project.ApplyStmtAcceptAction;
import com.mms.controller.action.project.ApplyStmtDeleteAction;
import com.mms.controller.action.project.ApplyStmtDenyAction;
import com.mms.controller.action.project.ApplyStmtRegisterAction;
import com.mms.controller.action.project.MyApplyStmtListFormAction;
import com.mms.controller.action.project.MyProjectListFormAction;
import com.mms.controller.action.project.MyProjectViewFormAction;
import com.mms.controller.action.project.ProjectApplyAcceptFormAction;
import com.mms.controller.action.project.ProjectApplyFormAction;
import com.mms.controller.action.project.ProjectApplyListFormAction;
import com.mms.controller.action.project.ProjectApplyViewFormAction;
import com.mms.controller.action.project.ProjectDeleteAction;
import com.mms.controller.action.project.ProjectManpowerDeployListFormAction;
import com.mms.controller.action.project.ProjectRegisterListFormAction;
import com.mms.controller.action.project.ProjectRegisterViewFormAction;
import com.mms.controller.action.project.ProjectRegisterAction;
import com.mms.controller.action.project.ProjectRegisterFormAction;
import com.mms.controller.action.project.ProjectUpdateAction;
import com.mms.controller.action.project.ProjectUpdateFormAction;
import com.mms.controller.action.project.ProjectViewFormAction;
import com.mms.controller.action.project.SearchUsePlAction;

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
			else if(command.equals("projectViewForm")) {
				action = new ProjectViewFormAction();
				
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
			else if(command.equals("projectApplyFormAction")) {
				action = new ProjectApplyFormAction();
				
			}
			else if(command.equals("applyStmtRegister")) {
				action = new ApplyStmtRegisterAction();
				
			}
			else if(command.equals("myApplyStmtListForm")) {
				action = new MyApplyStmtListFormAction();
				
			}
			else if(command.equals("applyStmtDelete")) {
				action = new ApplyStmtDeleteAction();
				
			}
			else if(command.equals("projectApplyAcceptForm")) {
				action = new ProjectApplyAcceptFormAction();
				
			}
			else if(command.equals("applyAccept")) {
				action = new ApplyStmtAcceptAction();
				
			}
			else if(command.equals("applyDeny")) {
				action = new ApplyStmtDenyAction();
				
			}
			else if(command.equals("myProjectListForm")) {
				action = new MyProjectListFormAction();
				
			}
			else if(command.equals("projectManpowerDeployListForm")) {
				action = new ProjectManpowerDeployListFormAction();
				
			}
			else if(command.equals("projectRegisterForm")) {
				action = new ProjectRegisterFormAction();
				
			}
			else if(command.equals("projectRegisterViewForm")) {
				action = new ProjectRegisterViewFormAction();
				
			}
			else if(command.equals("projectApplyViewForm")) {
				action = new ProjectApplyViewFormAction();
				
			}
			else if(command.equals("myProjectViewForm")) {
				action = new MyProjectViewFormAction();
				
			}
			else if(command.equals("searchUsePl")) {
				action = new SearchUsePlAction();
			}
			return action;
		}
		

}
