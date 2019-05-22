package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.MessageDAO;
import com.mms.vo.MessageVO;

public class MessageReceiveViewFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "profile/messageReceiveViewForm.jsp";
		String messageNum = request.getParameter("messageNum");
		MessageVO mVo = new MessageVO();
		MessageDAO mDao = MessageDAO.getInstance();
		mVo = mDao.viewReceiveMessage(messageNum);
		request.setAttribute("mVo", mVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
