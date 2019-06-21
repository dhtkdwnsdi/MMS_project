package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트 추천 인력배치 폼 액션
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
import com.mms.dao.PlDAO;
import com.mms.dao.ProgrammerDAO;
import com.mms.dao.ProjectDAO;
import com.mms.dao.UsePlDAO;
import com.mms.vo.ApplyStmtVO;
import com.mms.vo.PlVO;
import com.mms.vo.ProgrammerVO;
import com.mms.vo.ProjectVO;
import com.mms.vo.UsePlVO;

public class ProjectManpowerDeployFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/projectManpowerDeployForm.jsp";
		String projNum = request.getParameter("projNum");
		request.setAttribute("projNum", projNum);
		PlDAO plDao = PlDAO.getInstance();
		ArrayList<PlVO> plList = plDao.selectPl();
		request.setAttribute("plList", plList);
		
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		ArrayList<ApplyStmtVO> pMemList = aDao.progressProjectMemberList(projNum);
		request.setAttribute("pMemList", pMemList);
		
		ArrayList<ApplyStmtVO> recommendList = aDao.defaultRecommnedList();
		request.setAttribute("recommendList", recommendList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
