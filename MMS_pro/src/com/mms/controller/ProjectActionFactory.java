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
import com.mms.controller.action.project.ProjectManpowerDirectDeployFormAction;
import com.mms.controller.action.project.ProjectManpowerRecommendAction;
import com.mms.controller.action.project.ProjectManpowerSearchAction;
import com.mms.controller.action.project.ProjectRecommendDeployAction;
import com.mms.controller.action.project.ProjectListFormAction;
import com.mms.controller.action.project.ProjectListViewFormAction;
import com.mms.controller.action.project.ProjectManpowerDeployFormAction;
import com.mms.controller.action.project.ProjectRegisterAction;
import com.mms.controller.action.project.ProjectRegisterFormAction;
import com.mms.controller.action.project.ProjectStatApplyAction;
import com.mms.controller.action.project.ProjectStatEndAction;
import com.mms.controller.action.project.ProjectStatProgressAction;
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
			
			if(command.equals("projectListForm")) {
				// 프로젝트 전체 목록 액션
				action = new ProjectListFormAction();
				
			}
			else if(command.equals("projectRegister")) {
				// 프로젝트 등록 액션
				action = new ProjectRegisterAction();
				
			}
			else if(command.equals("projectViewForm")) {
				// 프로젝트 상세조회 폼
				action = new ProjectViewFormAction();
				
			}
			else if(command.equals("projectUpdateForm")) {
				// 프로젝트 수정 폼
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
				// 프로젝트 내 신청 내역
				action = new MyApplyStmtListFormAction();
				
			}
			else if(command.equals("applyStmtDelete")) {
				// 신청 취소
				action = new ApplyStmtDeleteAction();
				
			}
			else if(command.equals("projectApplyAcceptForm")) {
				// 프로젝트 신청 접수 승인 폼
				action = new ProjectApplyAcceptFormAction();
				
			}
			else if(command.equals("applyAccept")) {
				// 프로젝트 접수 승인
				action = new ApplyStmtAcceptAction();
				
			}
			else if(command.equals("applyDeny")) {
				// 프로젝트 신청 거절
				action = new ApplyStmtDenyAction();
				
			}
			else if(command.equals("myProjectListForm")) {
				// 내 프로젝트 내역 폼
				action = new MyProjectListFormAction();
				
			}
			else if(command.equals("projectManpowerDeployListForm")) {
				// 프로젝트 인력 배치 리스트 폼
				action = new ProjectManpowerDeployListFormAction();
				
			}
			else if(command.equals("projectRegisterForm")) {
				// 프로젝트 등록 폼
				action = new ProjectRegisterFormAction();
				
			}
			else if(command.equals("projectListViewForm")) {
				// 프로젝트 전체 목록 상세조회 폼
				action = new ProjectListViewFormAction();
				
			}
			else if(command.equals("projectApplyViewForm")) {
				// 프로젝트 신청 상세조회 폼
				action = new ProjectApplyViewFormAction();
				
			}
			else if(command.equals("myProjectViewForm")) {
				// 내프로젝트 내역 상세조회 폼
				action = new MyProjectViewFormAction();
				
			}
			else if(command.equals("searchUsePl")) {
				// 사용 프로그래밍 언어 검색 액션
				action = new SearchUsePlAction();
			}
			else if(command.equals("projectManpowerDeployForm")) {
				// 프로젝트 인력 추천배치 폼
				action = new ProjectManpowerDeployFormAction();
				
			}
			else if(command.equals("projStatProgress")) {
				// 프로젝트 진행 상태 수정 액션
				action = new ProjectStatProgressAction();
			}
			else if(command.equals("projStatEnd")) {
				// 프로젝트 상태 종료 액션
				action = new ProjectStatEndAction();
				
			}
			else if(command.equals("projStatApply")) {
				// 프로젝트 상태 모집 액션
				action = new ProjectStatApplyAction();
				
			}
			else if(command.equals("projectManpowerRecommend")) {
				// 프로젝트 인력 추천 액션
				action = new ProjectManpowerRecommendAction();
				
			}
			else if(command.equals("projectRecommendDeploy")) {
				// 프로젝트 인력 저장 액션
				action = new ProjectRecommendDeployAction();
			}
			else if(command.equals("projectManpowerDirectDeployForm")) {
				// 프로젝트 직접 배치 폼 액션
				action = new ProjectManpowerDirectDeployFormAction();
				
			}
			else if(command.equals("projectManpowerSearch")) {
				// 프로젝트 인력 검색 
				action = new ProjectManpowerSearchAction();
				
			}
			return action;
		}
		

}
