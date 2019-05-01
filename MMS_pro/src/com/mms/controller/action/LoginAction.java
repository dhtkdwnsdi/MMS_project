package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.dao.SignUpDAO;
import com.mms.vo.ProgrammerVo;
/**
 * 
 * @author LEE HAN
 *
 */
public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "main?command=main";
		
		
		HttpSession session = request.getSession();		//서블릿이나 자바에서 세션을 다룰 때 사용한다.
		
		if(session.getAttribute("LoginUser") != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
			
		} else {
			ProgrammerVo progVo = new ProgrammerVo();
			SignUpDAO signDao = SignUpDAO.getInstance();
			
			progVo.setId(request.getParameter("id"));
			progVo.setPassword(request.getParameter("password"));
			
			System.out.println(signDao.userCheck(progVo));
			
			switch(signDao.userCheck(progVo)) {
				case 1:{
						ProgrammerVo sessionVo = signDao.getProgInfo(progVo);
						session.setAttribute("LoginUser", sessionVo);
						System.out.println(sessionVo);
						break;
				}
				case 0:{
						request.setAttribute("message", "비밀번호를 확인하세요.");
						url = "main?command=loginForm";
						break;
				}
				case -1:{
						request.setAttribute("message", "존재하지 않는 회원입니다.");
						url = "main?command=loginForm";
						break;
				}
				default : request.setAttribute("message", "오류가 발생했습니다.");
				
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
			
		}
		
	}

}
