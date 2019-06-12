package com.mms.controller.action.introduce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProgrammerDAO;
import com.mms.vo.ProgrammerVO;

public class ProgrammerFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ProgrammerDAO progDao = ProgrammerDAO.getInstance();
		
		String progNum = request.getParameter("progNum");
		
		request.setAttribute("progNum", progNum);
		
		ProgrammerVO progVo = progDao.readProgrammer(progNum);
		
		request.setAttribute("progVo", progVo);
		
		new IntroduceListAction().execute(request, response);
		
	}

}
