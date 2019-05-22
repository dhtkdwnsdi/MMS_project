package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.vo.ApplyStmtVO;

public class ApplyStmtRegisterAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String progNum = request.getParameter("progNum");
		String projNum = request.getParameter("projNum");
		String applyPosition = request.getParameter("applyPosition");
		
		ApplyStmtVO aVo = new ApplyStmtVO();
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		aVo.setProgNum(progNum);
		aVo.setProjNum(projNum);
		aVo.setApplyPosition(applyPosition);
		
		aDao.insertApplyStmt(aVo);
			
		
	}

}
