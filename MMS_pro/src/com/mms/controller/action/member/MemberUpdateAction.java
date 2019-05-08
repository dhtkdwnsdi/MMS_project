package com.mms.controller.action.member;

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

		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String juso = request.getParameter("juso");
		String extraJuso = request.getParameter("extraJuso");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String bank = request.getParameter("bank");
		String account = request.getParameter("account");
		String progNum = request.getParameter("progNum");
		
		ProgrammerVO progVo = new ProgrammerVO();
		SignUpDAO signDao = SignUpDAO.getInstance();
		
		progVo.setId(id);
		progVo.setPassword(password);
		progVo.setName(name);
		progVo.setJuso(juso);
		progVo.setExtraJuso(extraJuso);
		progVo.setEmail(email);
		progVo.setTel(tel);
		progVo.setBank(bank);
		progVo.setAccount(account);
		progVo.setProgNum(progNum);
		
		System.out.println("progVo: " + progVo);
		signDao.updateUser(progVo);
		
	}

}
