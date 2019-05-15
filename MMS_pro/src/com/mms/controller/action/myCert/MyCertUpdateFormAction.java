package com.mms.controller.action.myCert;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.MyCertDAO;
import com.mms.vo.MyCertVO;

public class MyCertUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "profile/myCertUpdateForm.jsp";
		
		MyCertDAO myCertDao = MyCertDAO.getInstance();
		
		String myCertNum = request.getParameter("myCertNum");
		
		request.setAttribute("myCertNum", myCertNum);
		
		System.out.println(myCertNum);
		
		MyCertVO myCertVo = myCertDao.readMyCert(myCertNum);
		
		request.setAttribute("myCertVo", myCertVo);
		
		System.out.println(myCertVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
