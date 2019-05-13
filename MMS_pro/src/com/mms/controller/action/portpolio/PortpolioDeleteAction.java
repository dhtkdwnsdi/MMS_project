package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVo;

public class PortpolioDeleteAction implements Action{

	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "prog?command=portpolioListForm";
		
		PortpolioVo portVo = new PortpolioVo();
		
		String portNum = request.getParameter("portNum");
		
		System.out.println(portNum);
		
		portVo.setPortNum(portNum);
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		portDao.deletePortpolio(portNum);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
}
