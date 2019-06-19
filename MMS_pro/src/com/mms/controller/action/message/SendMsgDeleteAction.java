package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.SenderMsgDAO;
import com.mms.vo.SendMsgVO;

public class SendMsgDeleteAction implements Action {
	//전체 체크 삭제 action
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] msgCheck = request.getParameterValues("msgCheck");

		for (String string : msgCheck) {
			System.out.println(string);
		}
		String messageNumIndivi = "";

		SenderMsgDAO sDao = SenderMsgDAO.getInstance();
		for (int i = 0; i < msgCheck.length; i++) {
			messageNumIndivi = msgCheck[i];

			SendMsgVO sVo = new SendMsgVO();
			sVo.setSendNum((String) messageNumIndivi);

			int res = sDao.deleteMessage(messageNumIndivi);

		}
		new MessageListFormAction().execute(request, response);
	}

}
