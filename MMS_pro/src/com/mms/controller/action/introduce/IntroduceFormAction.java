package com.mms.controller.action.introduce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.IntroduceDAO;
import com.mms.vo.ProgrammerVO;

public class IntroduceFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();  
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser"); 
		
		String progNum = pVo.getProgNum(); 
		
		String url = "profile/introduceForm.jsp";
		
		IntroduceDAO progDao = IntroduceDAO.getInstance();
		
		ProgrammerVO progVo = progDao.readIntroduce(progNum);
		
		request.setAttribute("progVo", progVo);
		
		System.out.println(progVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
