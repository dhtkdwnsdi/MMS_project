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
		
		String url = "/prog?command=messageListForm#kt_portlet_tab_1_2";
		
		String sendSubject = request.getParameter("sendSubject");
		String sendContents = request.getParameter("sendContents");
		String sendReceiver = request.getParameter("sendReceiver");
		String sendSender = request.getParameter("sendSender");
		String sendFile = request.getParameter("sendFile");
		
		SendMsgVO sVo = new SendMsgVO();
		SenderMsgDAO sDao = SenderMsgDAO.getInstance();
		
		sVo.setSendSubject(sendSubject);
		sVo.setSendContents(sendContents);
		sVo.setSendReceiver(sendReceiver);
		sVo.setSendSender(sendSender);
		sVo.setSendFile(sendFile);
		
		sDao.insertMessage(sVo);
		
		String receiveSubject = request.getParameter("sendSubject");
		String receiveContents = request.getParameter("sendContents");
		String receiveReceiver = request.getParameter("sendReceiver");
		String receiveSender = request.getParameter("sendSender");
		String receiveFile = request.getParameter("sendFile");
		
		ReceiveMsgVO rVo = new ReceiveMsgVO();
		ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
		
		rVo.setReceiveSubject(receiveSubject);
		rVo.setReceiveContents(receiveContents);
		rVo.setReceiveReceiver(receiveReceiver);
		rVo.setReceiveSender(receiveSender);
		rVo.setReceiveFile(receiveFile);
		
		rDao.insertMessage(rVo);
		
		
		
	}

}
