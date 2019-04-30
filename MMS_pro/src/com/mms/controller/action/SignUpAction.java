package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.SignUpDAO;
import com.mms.vo.ProgrammerVo;
/**
 * 
 * @author LEE HAN
 *
 */
public class SignUpAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String grade = request.getParameter("grade");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String juso = request.getParameter("juso");
		String extraJuso = request.getParameter("extraJuso");
		String bank = request.getParameter("bank");
		String account = request.getParameter("account");
		
		ProgrammerVo progVo = new ProgrammerVo();
		SignUpDAO signDao = SignUpDAO.getInstance();
		progVo.setName(name);
		progVo.setId(id);
		progVo.setPassword(password);
		progVo.setGrade(grade);
		progVo.setGender(gender);
		progVo.setEmail(email);
		progVo.setTel(tel);
		progVo.setJuso(juso);
		progVo.setExtraJuso(extraJuso);
		progVo.setBank(bank);
		progVo.setAccount(account);
		
		signDao.signUp(progVo);
		
		
	}

}
