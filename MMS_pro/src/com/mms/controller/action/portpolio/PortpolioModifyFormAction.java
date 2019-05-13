package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVo;

public class PortpolioModifyFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/profile/portpolioModify.jsp";
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		String portNum = request.getParameter("portNum");
		request.setAttribute("portNum", portNum);
		
		PortpolioVo portVo = portDao.readPortpolio(portNum);
		
		request.setAttribute("portVo", portVo);
		
	}
}
		