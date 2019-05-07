package com.mms.controller.action;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.MyCertDAO;
import com.mms.vo.MyCertVO;

public class MyCertListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("액션왓나?");
		String url = "profile/myCertList.jsp";
		
		MyCertDAO myCertDao = MyCertDAO.getInstance();
		
		String LoginUser = (String)request.getSession().getAttribute("LoginUser");
		

		List<MyCertVO> myCertList = myCertDao.selectMyCert(LoginUser);
		
		request.setAttribute("myCertList", myCertList);
		
		System.out.println(myCertList);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
