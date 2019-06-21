package com.mms.controller.action.memberSet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.SignUpDAO;
import com.mms.vo.ProgrammerVO;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SignUpDAO sDao = SignUpDAO.getInstance();
		ProgrammerVO progVo = (ProgrammerVO) request.getAttribute("progVo");
		System.out.println("progVo: " + progVo);
		
		sDao.updateUser(progVo);
		
   }
}


