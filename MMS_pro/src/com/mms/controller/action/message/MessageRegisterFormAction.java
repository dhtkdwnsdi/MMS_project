package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;

public class MessageRegisterFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "profile/messageReRegisterForm.jsp";
		//메세지 등록 action - send와 receive 두개의 테이블로 보냄
		String sendReceiver = request.getParameter("sendReceiver");
		request.setAttribute("sendReceiver", sendReceiver);
		
		String sendName = request.getParameter("sendName");
		request.setAttribute("sendName", sendName);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
