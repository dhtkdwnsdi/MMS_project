package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ReceiverMsgDAO;
import com.mms.vo.ReceiveMsgVO;

public class ReceiveMsgDeleteAction implements Action {
	//전체 체크 삭제 action
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] msgCheck = request.getParameterValues("msgCheck");

		for (String string : msgCheck) {
			System.out.println(string);
		}
		String messageNumIndivi = "";

		ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
		for (int i = 0; i < msgCheck.length; i++) {
			messageNumIndivi = msgCheck[i];

			ReceiveMsgVO rVo = new ReceiveMsgVO();
			rVo.setReceiveNum((String) messageNumIndivi);

			int res = rDao.deleteMessage(messageNumIndivi);

		}
		new MessageListFormAction().execute(request, response);
	}

}
