package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트 수정 폼 액션
 *  
 */
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.dao.UsePlDAO;
import com.mms.vo.ProjectVO;
import com.mms.vo.UsePlVO;

public class ProjectUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/projectUpdateForm.jsp";
		String projNum = request.getParameter("projNum");
		ProjectDAO pDao = ProjectDAO.getInstance();
		ProjectVO projVo = new ProjectVO();
		projVo = pDao.viewProject(projNum);
		request.setAttribute("projVo", projVo);
		
		UsePlDAO uDao = UsePlDAO.getInstance();
		ArrayList<UsePlVO> usePlList = uDao.usePlList(projNum);
		request.setAttribute("uList", usePlList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
