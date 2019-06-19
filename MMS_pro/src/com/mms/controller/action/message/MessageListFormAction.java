package com.mms.controller.action.message;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.ReceiverMsgDAO;
import com.mms.dao.SenderMsgDAO;
import com.mms.vo.ProgrammerVO;
import com.mms.vo.ReceiveMsgVO;
import com.mms.vo.SendMsgVO;

public class MessageListFormAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String url = "profile/messageListForm.jsp";
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = pVo.getProgNum();
		
		
		ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
		SenderMsgDAO sDao = SenderMsgDAO.getInstance();
		//받은 메세지 List
		ArrayList<ReceiveMsgVO> ReceiveMessageList = rDao.ReceiveMessageList(progNum);
		request.setAttribute("ReceiveMessageList", ReceiveMessageList);
		//보낸 메세지 List
		ArrayList<SendMsgVO> SendMessageList = sDao.SendMessageList(progNum);
		request.setAttribute("SendMessageList", SendMessageList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
		
	}
	

}
