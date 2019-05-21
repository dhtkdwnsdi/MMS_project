package com.mms.controller.action.pl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlDAO;
import com.mms.vo.PlVO;

public class PlSearchFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/profile/searchPlName.jsp";
				
		PlDAO plDao = PlDAO.getInstance();
		
		ArrayList<PlVO> PlList = (ArrayList<PlVO>) plDao.selectPl();
		
		request.setAttribute("PlList", PlList);
		
		System.out.println(PlList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	}

}
