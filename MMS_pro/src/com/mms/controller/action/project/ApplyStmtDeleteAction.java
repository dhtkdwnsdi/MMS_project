package com.mms.controller.action.project;


/**
 *  @author LEE HAN
 *  
 *  프로젝트 접수 거절 액션
 *  
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;

public class ApplyStmtDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String applyStmtNum = request.getParameter("applyStmtNum");
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		aDao.deleteApplyStmt(applyStmtNum);
		
		new MyApplyStmtListFormAction().execute(request, response);
		
		
	}

}
