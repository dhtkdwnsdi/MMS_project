package com.mms.controller.action.introduce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.IntroduceDAO;
import com.mms.vo.ProgrammerVO;

public class IntroduceRegisterFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url ="profile/introduceRegisterForm.jsp";
		
		IntroduceDAO progDao = IntroduceDAO.getInstance();

		String id = request.getParameter("id");	
		
		request.setAttribute("id", id);
		
		ProgrammerVO progVo = progDao.readIntroduce(id);
		
		request.setAttribute("progVo", progVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
}
}