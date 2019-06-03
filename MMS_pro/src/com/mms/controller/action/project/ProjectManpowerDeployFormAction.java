package com.mms.controller.action.project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlDAO;
import com.mms.dao.ProgrammerDAO;
import com.mms.dao.ProjectDAO;
import com.mms.dao.UsePlDAO;
import com.mms.vo.PlVO;
import com.mms.vo.ProgrammerVO;
import com.mms.vo.ProjectVO;
import com.mms.vo.UsePlVO;

public class ProjectManpowerDeployFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/projectManpowerDeployForm.jsp";
		String projNum = request.getParameter("projNum");
		
		PlDAO plDao = PlDAO.getInstance();
		ArrayList<PlVO> plList = plDao.selectPl();
		request.setAttribute("plList", plList);
		
		UsePlDAO uDao = UsePlDAO.getInstance();
		ArrayList<UsePlVO> usePlList = uDao.usePlList(projNum);
		request.setAttribute("usePlList", usePlList);
		
//		ProjectDAO pDao = ProjectDAO.getInstance();
//		ProjectVO pVo = pDao.viewProject(projNum);
//		request.setAttribute("pVo", pVo);
		
//		ArrayList<ProgrammerVO> progList = pDao.allProgrammer();
//		request.setAttribute("progList", progList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
