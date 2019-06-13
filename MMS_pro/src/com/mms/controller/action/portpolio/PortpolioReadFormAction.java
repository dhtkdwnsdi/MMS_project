package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVO;

public class PortpolioReadFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String url = "profile/portpolioReadForm.jsp";
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		String portNum = request.getParameter("portNum");
		
		request.setAttribute("portNum", portNum);
		
		//포트폴리오 상세 조회
		PortpolioVO portVo = portDao.readPortpolio(portNum);
		
		System.out.println(portVo);
		
		request.setAttribute("portVo", portVo);
				
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
