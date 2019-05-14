package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.GrantDAO;
import com.mms.vo.ProgrammerVO;

public class GrantModifyAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String url = "/prog?command=grantListForm";
		
		String progNum = request.getParameter("progNum");
//		request.setAttribute("progNum",progNum);
		//String name = request.getParameter("name");
		String grant = request.getParameter("grant");
//		request.setAttribute("grant", grant);
		
		ProgrammerVO pVo = new ProgrammerVO();
		
		pVo.setProgNum(progNum);
		//pVo.setName(name);
		pVo.setGrant(grant);
		
		System.out.println("grant : " + grant);
		System.out.println("progNum : " + progNum);
		
		GrantDAO gDao = GrantDAO.getInstance();
		
		gDao.updateGrant(pVo);
		
		System.out.println(pVo);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
