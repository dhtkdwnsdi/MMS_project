package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ReceiverMsgDAO;
import com.mms.dao.SenderMsgDAO;
import com.mms.vo.ReceiveMsgVO;
import com.mms.vo.SendMsgVO;

public class MessageRegisterAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/prog?command=messageListForm";
		
		String sendSubject = request.getParameter("sendSubject");
		String sendContents = request.getParameter("sendContents");
		String sendSender = request.getParameter("sendSender");
		String sendReceiver = request.getParameter("sendReceiver");
		
		SendMsgVO sVo = new SendMsgVO();
		SenderMsgDAO sDao = SenderMsgDAO.getInstance();
		
		sVo.setSendSubject(sendSubject);
		sVo.setSendContents(sendContents);
		sVo.setSendSender(sendSender);
		sVo.setSendReceiver(sendReceiver);
		
		sDao.insertMessage(sVo);
		
		String receiveSubject = request.getParameter("sendSubject");
		String receiveContents = request.getParameter("sendContents");
		String receiveSender = request.getParameter("sendSender");
		String receiveReceiver = request.getParameter("sendReceiver");
		
		ReceiveMsgVO rVo = new ReceiveMsgVO();
		ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
		
		rVo.setReceiveSubject(receiveSubject);
		rVo.setReceiveContents(receiveContents);
		rVo.setReceiveSender(receiveSender);
		rVo.setReceiveReceiver(receiveReceiver);
		
		rDao.insertMessage(rVo);
		
		
		
	}

}
