package com.mms.controller.action.pls;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.PlsDAO;
import com.mms.vo.PlsVO;

public class PlsDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PlsVO plsVo = new PlsVO();
		
		String plsNum = request.getParameter("plsNum");
		
		System.out.println(plsNum);
		
		plsVo.setPlsNum(plsNum);
		
		PlsDAO plsDao = PlsDAO.getInstance();
		
		plsDao.deletePls(plsNum);
		
		new ResumeFormAction().execute(request, response);		
	}

}
