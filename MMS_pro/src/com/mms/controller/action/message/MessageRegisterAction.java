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
		
		SenderMsgDAO sDao = SenderMsgDAO.getInstance();
		SendMsgVO sVo = (SendMsgVO) request.getAttribute("sVo");
		sDao.insertMessage(sVo);
		
		ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
		ReceiveMsgVO rVo = (ReceiveMsgVO) request.getAttribute("rVo");
		rDao.insertMessage(rVo);
		
		new MessageListFormAction().execute(request, response);
		
		
	}

}
