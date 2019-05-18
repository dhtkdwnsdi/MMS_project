package com.mms.controller.action.introduce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.IntroduceDAO;
import com.mms.vo.ProgrammerVO;

public class IntroduceRegisterAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/prog?command=introduceRegisterForm";
	
		
		String introduce1 = request.getParameter("introduce1");
		String introduce2 = request.getParameter("introduce2");
		String introduce3 = request.getParameter("introduce3");
		String introduce4 = request.getParameter("introduce4");
		String introFile = request.getParameter("introFile");

		
		ProgrammerVO pVo = new ProgrammerVO();
		IntroduceDAO introDao = IntroduceDAO.getInstance();
		
		pVo.setIntroduce1(introduce1);
		pVo.setIntroduce2(introduce2);
		pVo.setIntroduce3(introduce3);
		pVo.setIntroduce4(introduce4);
		pVo.setIntroFile(introFile);
		
		introDao.insertIntroduce(pVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
		
		
}
}