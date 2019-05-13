package com.mms.controller.action.pls;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlsDAO;
import com.mms.vo.PlsVo;

public class PlsListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/profile/plsList.jsp";
		
		PlsDAO pDao = PlsDAO.getInstance();
		
		String LoginUser = (String)request.getSession().getAttribute("LoginUser");
		
		List<PlsVo> plsList = pDao.selectPls(LoginUser);
		
		request.setAttribute("plsList", plsList);
		System.out.println(plsList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
