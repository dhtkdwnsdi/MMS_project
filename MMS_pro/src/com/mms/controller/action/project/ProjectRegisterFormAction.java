package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트 등록 폼 액션
 *  
 */
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlDAO;
import com.mms.vo.PlVO;

public class ProjectRegisterFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "project/projectRegisterForm.jsp";
		
		PlDAO pDao = PlDAO.getInstance();
		ArrayList<PlVO> list = new ArrayList<PlVO>();
		list = pDao.selectPl();
		request.setAttribute("plList", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
		
	}

}
