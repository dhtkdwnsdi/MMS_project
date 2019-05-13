package com.mms.controller.action.portpolio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVo;
import com.mms.vo.ProgrammerVO;

public class PortpolioListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "profile/portpolioList.jsp";
		HttpSession session = request.getSession();
		
		ProgrammerVO pVo = (ProgrammerVO)session.getAttribute("LoginUser");
		
		String progNum = pVo.getProgNum();
		
		PortpolioDAO pDao = PortpolioDAO.getInstance();
		/*
		 * List<PortpolioVo> portpolioList = pDao.selectPortpolio(progNum);
		 * 
		 * request.setAttribute("portpolioList", portpolioList);
		 * System.out.println("portpolioList");
		 */
		
		ArrayList<PortpolioVo> portpolioList = pDao.portpolioList(progNum);
		request.setAttribute("portpolioList", portpolioList);
		System.out.println("listform");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
