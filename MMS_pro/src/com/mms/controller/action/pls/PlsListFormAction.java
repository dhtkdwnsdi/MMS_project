package com.mms.controller.action.pls;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.PlsDAO;
import com.mms.vo.PlsVO;
import com.mms.vo.ProgrammerVO;

public class PlsListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// java에서 세션을 이용할 때 꼭 작성.
		HttpSession session = request.getSession();     
				
		String url = "profile/plsList.jsp";

		// 현재 세션의 ProgrammerVO 타입인 LoginUser를 pVo에 대입
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser"); 
				
		// pVo의 셋팅된 progNum을 가져와서 progNum 변수에 대입
		String progNum = pVo.getProgNum();
		
		PlsDAO plsDao = PlsDAO.getInstance();

		List<PlsVO> plsList = plsDao.selectPls(progNum);
		
		
		request.setAttribute("plsList", plsList);
		
		System.out.println(plsList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
