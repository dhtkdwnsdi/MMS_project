package com.mms.controller.action.project;

/**
 *  @author LEE HAN
 *  
 *  내 프로젝트  내역 상세조회 폼 액션
 *  
 */

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.dao.ProjectDAO;
import com.mms.dao.UsePlDAO;
import com.mms.vo.ApplyStmtVO;
import com.mms.vo.ProjectVO;
import com.mms.vo.UsePlVO;

public class MyProjectViewFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/myProjectViewForm.jsp";
		
		String projNum = request.getParameter("projNum");
		ProjectVO projVo = new ProjectVO();
		ProjectDAO pDao = ProjectDAO.getInstance();
		
		projVo = pDao.viewProject(projNum);
		request.setAttribute("projVo", projVo);
		
		UsePlDAO uDao = UsePlDAO.getInstance();
		ArrayList<UsePlVO> usePlList = uDao.usePlList(projNum);
		request.setAttribute("uList", usePlList);
		
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		ArrayList<ApplyStmtVO> memberList = aDao.projectMemberList(projNum);
		request.setAttribute("mList", memberList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
