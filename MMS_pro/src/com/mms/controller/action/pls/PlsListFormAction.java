package com.mms.controller.action.pls;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.PlsDAO;
import com.mms.vo.PlsVo;
import com.mms.vo.ProgrammerVO;

public class PlsListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String url = "/profile/plsListForm.jsp";
		
		PlsDAO pDao = PlsDAO.getInstance();

		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = pVo.getProgNum();
		
		List<PlsVo> plsList = pDao.selectPls(progNum);
		
		request.setAttribute("plsList", plsList);
		System.out.println(plsList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
