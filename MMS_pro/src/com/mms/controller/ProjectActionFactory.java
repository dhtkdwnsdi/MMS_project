package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.project.ProjectListFormAction;

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
			
			if(command.equals("projectListForm")) {
				action = new ProjectListFormAction();
			}
			
			return action;
		}
		

}
