package com.mms.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVo;

public class PortpolioListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/profile/portpolioList.jsp";
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		String LoginUser = (String)request.getSession().getAttribute("LoginUser");
		
		List<PortpolioVo> portpolioList = portDao.selectPortpolio(LoginUser);
		
		request.setAttribute("portpolioList", portpolioList);
		System.out.println(portpolioList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
