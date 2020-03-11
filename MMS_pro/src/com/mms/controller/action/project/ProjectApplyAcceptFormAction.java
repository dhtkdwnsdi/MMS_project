package com.mms.controller.action.project;

/**
 *  @author LEE HAN
 *  
 *  프로젝트  접수 승인 폼 액션
 *  
 */

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.vo.ApplyStmtVO;
import com.mms.vo.ProgrammerVO;

public class ProjectApplyAcceptFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String url = "project/projectApplyAcceptForm.jsp";
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = pVo.getProgNum();
		
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		ArrayList<ApplyStmtVO> acceptList = new ArrayList<ApplyStmtVO>();
		acceptList = aDao.applyAcceptList(progNum);
		System.out.println(acceptList);
		request.setAttribute("acceptList", acceptList);
		
		
		ArrayList<ApplyStmtVO> allApplyStmt = aDao.allApplyStmt(progNum);
		request.setAttribute("allList", allApplyStmt);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
