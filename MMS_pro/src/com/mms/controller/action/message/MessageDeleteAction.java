package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.MessageDAO;
import com.mms.vo.MessageVO;

public class MessageDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String[] msgCheck = request.getParameterValues("msgCheck");
		
		for(String string : msgCheck) {
			System.out.println(string);
		}
		String messageNumIndivi = "";
		
		MessageDAO mDao = MessageDAO.getInstance();
		for(int i = 0; i < msgCheck.length;i++) {
			messageNumIndivi = msgCheck[i];
			
			MessageVO mVo = new MessageVO();
			mVo.setMessageNum((String)messageNumIndivi);
			
			int res = mDao.deleteMessage(messageNumIndivi);
			
		}
		new MessageListFormAction().execute(request,response);
	}

}
