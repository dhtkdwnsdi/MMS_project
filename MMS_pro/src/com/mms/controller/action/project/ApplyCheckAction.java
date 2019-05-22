package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.vo.ApplyStmtVO;

public class ApplyCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result;
		String projNum = request.getParameter("projNum");
		String progNum = request.getParameter("progNum");
		ApplyStmtVO aVo = new ApplyStmtVO();
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		aVo.setProjNum(projNum);
		aVo.setProgNum(progNum);
		
		result = aDao.applyCheck(aVo);
		
		if(result == 0) {
			new ApplyStmtRegisterAction().execute(request, response);
		}
		
	}

}
