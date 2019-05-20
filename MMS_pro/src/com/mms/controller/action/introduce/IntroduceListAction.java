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

public class IntroduceListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();		// java에서 세션을 이용할 때 꼭 작성.
		String url ="profile/introduceList.jsp";
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");  // 현재 세션의 ProgrammerVO 타입인 LoginUser를 pVo에 대입
		String id = pVo.getId();		// pVo의 셋팅된 progNum을 가져와서 progNum 변수에 대입
		
		IntroduceDAO progDao = IntroduceDAO.getInstance();
		
		ProgrammerVO progVo = progDao.readIntroduce(id);
		
		request.setAttribute("progVo", progVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}