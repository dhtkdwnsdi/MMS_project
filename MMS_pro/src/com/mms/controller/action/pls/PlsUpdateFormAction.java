package com.mms.controller.action.pls;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlsDAO;
import com.mms.vo.PlsVO;

public class PlsUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String url = "profile/plsUpdateForm.jsp";
		
		PlsDAO plsDao = PlsDAO.getInstance();
		
		String plsNum = request.getParameter("plsNum");
		
		request.setAttribute("plsNum", plsNum);
		
		PlsVO plsVo = plsDao.readPls(plsNum);
		
		request.setAttribute("plsVo", plsVo);
		
		System.out.println(plsVo);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
