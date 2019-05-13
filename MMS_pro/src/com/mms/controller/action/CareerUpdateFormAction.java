package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.CareerDAO;
import com.mms.vo.CareerVO;

public class CareerUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "profile/careerUpdateForm.jsp";
		
		CareerDAO careerDao = CareerDAO.getInstance();
		
		String careerNum = request.getParameter("careerNum");
		
		request.setAttribute("careerNum", careerNum);
		
		CareerVO careerVo = careerDao.readCareer(careerNum);
		
		request.setAttribute("careerVo", careerVo);
		
		System.out.println(careerVo);	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
