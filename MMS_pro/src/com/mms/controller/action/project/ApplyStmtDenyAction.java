package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;

public class ApplyStmtDenyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String applyStmtNum = request.getParameter("applyStmtNum");
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		
		aDao.denyApply(applyStmtNum);
		
		new ProjectApplyAcceptFormAction().execute(request, response);
		
	}

}
