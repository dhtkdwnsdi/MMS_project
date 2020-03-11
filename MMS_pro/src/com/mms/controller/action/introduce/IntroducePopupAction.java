package com.mms.controller.action.introduce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.IntroduceDAO;
import com.mms.vo.ProgrammerVO;

public class IntroducePopupAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String progNum = request.getParameter("progNum");
		
		request.setAttribute("progNum", progNum);

		String url = "profile/introducePopup.jsp";
		
		IntroduceDAO progDao = IntroduceDAO.getInstance();
		
		ProgrammerVO progVo = progDao.readIntroduce(progNum);
		
		request.setAttribute("progVo", progVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
