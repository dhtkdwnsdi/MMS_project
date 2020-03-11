package com.mms.controller.action.career;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.CareerDAO;
import com.mms.vo.CareerVO;

public class CareerUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String careerNum = request.getParameter("careerNum");
	request.setAttribute("careerNum", careerNum);
	
	String companyName = request.getParameter("companyName");
	request.setAttribute("companyName", companyName);
	
	String department = request.getParameter("department");
	request.setAttribute("department", department);
	
	String position = request.getParameter("position");
	request.setAttribute("position", position);
	
	String joinDate = request.getParameter("joinDate");
	request.setAttribute("joinDate", joinDate);
	
	String retireDate = request.getParameter("retireDate");
	request.setAttribute("retireDate", retireDate);
	
	CareerVO careerVo = new CareerVO();
	
	careerVo.setCareerNum(careerNum);
	careerVo.setCompanyName(companyName);
	careerVo.setDepartment(department);
	careerVo.setPosition(position);
	careerVo.setJoinDate(joinDate);
	careerVo.setRetireDate(retireDate);
	
	System.out.println(careerVo);

	CareerDAO careerDao = CareerDAO.getInstance();
	careerDao.updateCareer(careerVo);
	
	new ResumeFormAction().execute(request, response);
	
	}

}
