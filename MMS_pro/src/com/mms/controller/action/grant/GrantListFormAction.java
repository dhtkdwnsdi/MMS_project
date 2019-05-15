package com.mms.controller.action.grant;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.GrantDAO;
import com.mms.vo.ProgrammerVO;

public class GrantListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "admin/grantList.jsp";
		
		GrantDAO gDao = GrantDAO.getInstance();
		
		List<ProgrammerVO> gList = gDao.selectGrant();
		
		request.setAttribute("gList", gList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
	

}
