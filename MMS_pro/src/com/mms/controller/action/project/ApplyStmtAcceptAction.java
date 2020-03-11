package com.mms.controller.action.project;

/**
 *  @author LEE HAN
 *  
 *  프로젝트 접수 승인 액션
 *  
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;

public class ApplyStmtAcceptAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String applyStmtNum = request.getParameter("applyStmtNum");
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		aDao.acceptApply(applyStmtNum);
		aDao.updateProgState(applyStmtNum);
		
		new ProjectApplyAcceptFormAction().execute(request, response);
		
	}

}
