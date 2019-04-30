package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.SignUpDao;

public class idCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		SignUpDao signDao = SignUpDao.getInstance();
		int result = signDao.idCheck(id);
		System.out.println(result);
		
	}

}
