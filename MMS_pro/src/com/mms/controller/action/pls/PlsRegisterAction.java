package com.mms.controller.action.pls;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PlsDAO;
import com.mms.vo.PlsVo;

public class PlsRegisterAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url="/prog?command=plsListForm";
		
		//parameter가져오기
		String plsNum = request.getParameter("plsNum");
		String plNum = request.getParameter("plNum");
		String profiency = request.getParameter("profiency");
		String experience = request.getParameter("experience");
		String progNum	= request.getParameter("progNum");
		
		
		PlsVo pVo = new PlsVo();
		PlsDAO pDao = PlsDAO.getInstance();
		
		//parameter출력
		System.out.println("plsNum : " + plsNum);
		System.out.println("plNum : " + plNum);
		System.out.println("profiency : " + profiency);
		System.out.println("experience : " + experience);
		System.out.println("progNum : " + progNum);
		
		
		
		pVo.setPlsNum(plsNum);
		pVo.setPlNum(plNum);
		pVo.setProfiency(profiency);
		pVo.setExperience(experience);
		pVo.setProgNum(progNum);
		
		
		pDao.insertPls(pVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
