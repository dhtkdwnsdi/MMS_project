package com.mms.controller.action.myCert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.MyCertDAO;
import com.mms.vo.MyCertVO;

public class MyCertDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		MyCertVO myCertVo = new MyCertVO();
		
		String myCertNum = request.getParameter("myCertNum");
		
		System.out.println(myCertNum);
		
		myCertVo.setCertNum(myCertNum);
		
		MyCertDAO myCertDao = MyCertDAO.getInstance();
		
		myCertDao.deleteMyCert(myCertNum);
		
		new ResumeFormAction().execute(request, response);
		
	}

}
