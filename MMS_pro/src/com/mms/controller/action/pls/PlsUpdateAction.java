package com.mms.controller.action.pls;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.PlsDAO;
import com.mms.vo.PlsVO;

public class PlsUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String plsNum = request.getParameter("plsNum");
		request.setAttribute("plsNum", plsNum);
		
		String plNum = request.getParameter("plNum");
		request.setAttribute("plNum", plNum);
		
		String profiency = request.getParameter("profiency");
		request.setAttribute("profiency", profiency);
		
		String experience = request.getParameter("experience");
		request.setAttribute("experience", experience);
		
		PlsVO plsVo = new PlsVO();
		
		plsVo.setPlsNum(plsNum);
		plsVo.setPlNum(plNum);
		plsVo.setProfiency(profiency);
		plsVo.setExperience(experience);
		
		PlsDAO plsDao = PlsDAO.getInstance();
		
		plsDao.updatePls(plsVo);
		
		new ResumeFormAction().execute(request, response);
		
		
	}

}
