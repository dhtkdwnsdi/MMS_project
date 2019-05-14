package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.IntroduceDAO;
import com.mms.vo.ProgrammerVO;

public class IntroduceRegisterAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/prog?command=introduceRegisterForm";
	
		
		String introduce = request.getParameter("introduce");
		String introFile = request.getParameter("introFile");

		
		ProgrammerVO pVo = new ProgrammerVO();
		IntroduceDAO introDao = IntroduceDAO.getInstance();
		
		pVo.setIntroduce(introduce);
		pVo.setIntroFile(introFile);
		
		introDao.insertIntroduce(pVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
		
		
}
}