package com.mms.controller.action.grant;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.GrantDAO;
import com.mms.vo.ProgrammerVO;

public class GrantUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String progNum = request.getParameter("progNum");
		String grant = request.getParameter("grant");


		ProgrammerVO pVo = new ProgrammerVO();

		pVo.setProgNum(progNum);
		pVo.setGrant(grant);

		System.out.println("grant : " + grant);
		System.out.println("progNum : " + progNum);

		GrantDAO gDao = GrantDAO.getInstance();

		gDao.updateGrant(pVo);

		System.out.println(pVo);

	}

}
