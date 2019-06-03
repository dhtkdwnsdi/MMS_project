package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVO;

public class PortpolioUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url="profile/portpolioUpdateForm.jsp";
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		String portNum = request.getParameter("portNum");
		
		request.setAttribute("portNum", portNum);
		
		PortpolioVO portVo = portDao.readPortpolio(portNum);
		
		request.setAttribute("portVo", portVo);
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
