package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.SenderMsgDAO;
import com.mms.vo.SendMsgVO;

public class MessageSendViewFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "profile/messageSendViewForm.jsp";
		String sendNum = request.getParameter("sendNum");
		SendMsgVO sVo = new SendMsgVO();
		SenderMsgDAO sDao = SenderMsgDAO.getInstance();
		sVo = sDao.viewMessage(sendNum);
		request.setAttribute("sVo", sVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
