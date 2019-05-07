package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.vo.CareerVO;
import com.mms.vo.ProgrammerVO;
/**
 * 
 * @author LEE HAN
 *
 */
public class CareerListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String url ="profile/careerListForm.jsp";
		CareerVO cVo = new CareerVO();
		
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");  // 현재 세션의 ProgrammerVO 타입인 LoginUser를 pVo에 대입
		cVo.setProgNum(pVo.getProgNum());		// pVo의 progNum을 가져와서 cVo progNum에 설정
		System.out.println(cVo.getProgNum());	
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
