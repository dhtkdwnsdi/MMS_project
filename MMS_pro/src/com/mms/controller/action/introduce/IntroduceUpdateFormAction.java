package com.mms.controller.action.introduce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.IntroduceDAO;
import com.mms.vo.ProgrammerVO;

public class IntroduceUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url ="profile/introduceUpdateForm.jsp";
		
		IntroduceDAO progDao = IntroduceDAO.getInstance();

		String progNum = request.getParameter("progNum");	
		
		request.setAttribute("progNum", progNum);
		
		ProgrammerVO progVo = progDao.readIntroduce(progNum);
		
		request.setAttribute("progVo", progVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
