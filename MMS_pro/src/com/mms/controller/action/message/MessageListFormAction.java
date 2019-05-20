package com.mms.controller.action.message;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.MessageDAO;
import com.mms.vo.MessageVO;
import com.mms.vo.ProgrammerVO;

public class MessageListFormAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String url = "profile/messageListForm.jsp";
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = pVo.getProgNum();
		
		MessageDAO mDao = MessageDAO.getInstance();
		
		ArrayList<MessageVO> sendMessageList = mDao.sendMessageList(progNum);
		request.setAttribute("sendMessageList", sendMessageList);
		
		ArrayList<MessageVO> receiveMessageList = mDao.receiveMessageList(progNum);
		request.setAttribute("receiveMessageList", receiveMessageList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
		
	}
	

}
