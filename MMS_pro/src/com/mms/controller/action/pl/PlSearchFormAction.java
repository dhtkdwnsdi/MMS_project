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

	
	//프로그래밍언어 검색 form action
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/profile/searchPlName.jsp";
				
		PlDAO plDao = PlDAO.getInstance();
		
		//프로그래밍 언어 검색 리스트 
		ArrayList<PlVO> plList = (ArrayList<PlVO>) plDao.selectPl();
		
		request.setAttribute("plList", plList);
		
		System.out.println(plList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	}

}
