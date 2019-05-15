package com.mms.controller.action.grant;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.GrantDAO;
import com.mms.vo.ProgrammerVO;

public class GrantUpdateFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "admin/grantUpdate.jsp";
		
		GrantDAO gDao = GrantDAO.getInstance();
		
		String progNum = request.getParameter("progNum");
		
		request.setAttribute("progNum", progNum);
		
		ProgrammerVO pVo = gDao.readGrant(progNum);
		
		request.setAttribute("pVo", pVo);
		
		System.out.println(pVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
