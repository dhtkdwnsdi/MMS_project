package com.mms.controller.action.pl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlDAO;
import com.mms.vo.PlVO;

public class PlDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "prog?command=plListForm";
		
		PlVO plVo = new PlVO();
		
		String plNum = request.getParameter("plNum");
		
		plVo.setPlNum(plNum);
		
		PlDAO plDao = PlDAO.getInstance();
		
		plDao.deletePl(plNum);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
