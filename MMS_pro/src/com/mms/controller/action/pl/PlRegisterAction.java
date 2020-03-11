package com.mms.controller.action.pl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlDAO;
import com.mms.vo.PlVO;

public class PlRegisterAction implements Action{

	
	//프로그래밍언어 등록 action
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "prog?command=plListForm";
		
		String plNum = request.getParameter("plNum");
		String plName = request.getParameter("plName");
		
		System.out.println("plNum : " + plNum);
		System.out.println("plName : " + plName);
		
		PlVO plVo = new PlVO();
		
		plVo.setPlNum(plNum);
		plVo.setPlName(plName);
		
		PlDAO plDao = PlDAO.getInstance();
		
		plDao.insertPl(plVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
