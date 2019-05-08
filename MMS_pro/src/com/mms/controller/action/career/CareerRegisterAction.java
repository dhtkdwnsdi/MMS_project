package com.mms.controller.action.career;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.CareerDAO;
import com.mms.vo.CareerVO;

public class CareerRegisterAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String progNum = request.getParameter("progNum");
		String companyName = request.getParameter("companyName");
		String department = request.getParameter("department");
		String position = request.getParameter("position");
		String joinDate = request.getParameter("joinDate");
		String retireDate = request.getParameter("retireDate");
		
		CareerVO cVo = new CareerVO();
		CareerDAO cDao = CareerDAO.getInstance();
		
		cVo.setProgNum(progNum);
		cVo.setCompanyName(companyName);
		cVo.setDepartment(department);
		cVo.setPosition(position);
		if(joinDate != "" ) {
		cVo.setJoinDate(joinDate);
		}
		if(retireDate != "") {
			cVo.setRetireDate(retireDate);
		}
		
		System.out.println("cVo : " + cVo);
		
		cDao.insertCareer(cVo);
		
		
	}

}
