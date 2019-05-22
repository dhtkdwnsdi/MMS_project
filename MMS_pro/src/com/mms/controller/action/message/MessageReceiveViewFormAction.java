package com.mms.controller.action.message;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ReceiverMsgDAO;
import com.mms.vo.ReceiveMsgVO;

public class MessageReceiveViewFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "profile/messageReceiveViewForm.jsp";
		String receiveNum = request.getParameter("receiveNum");
		ReceiveMsgVO rVo = new ReceiveMsgVO();
		ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
		rVo = rDao.viewMessage(receiveNum);
		request.setAttribute("rVo", rVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
