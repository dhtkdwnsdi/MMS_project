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
		String sendReceiver = request.getParameter("sendReceiver");
		String sendSender = request.getParameter("sendSender");
		
		SendMsgVO sVo = new SendMsgVO();
		SenderMsgDAO sDao = SenderMsgDAO.getInstance();
		
		sVo.setSendSubject(sendSubject);
		sVo.setSendContents(sendContents);
		sVo.setSendReceiver(sendReceiver);
		sVo.setSendSender(sendSender);
		
		sDao.insertMessage(sVo);
		
		String receiveSubject = request.getParameter("sendSubject");
		String receiveContents = request.getParameter("sendContents");
		String receiveReceiver = request.getParameter("sendReceiver");
		String receiveSender = request.getParameter("sendSender");
		
		ReceiveMsgVO rVo = new ReceiveMsgVO();
		ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
		
		rVo.setReceiveSubject(receiveSubject);
		rVo.setReceiveContents(receiveContents);
		rVo.setReceiveReceiver(receiveReceiver);
		rVo.setReceiveSender(receiveSender);
		
		rDao.insertMessage(rVo);
		
		
		
	}

}
