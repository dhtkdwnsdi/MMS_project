package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.UsePlDAO;
import com.mms.vo.UsePlVO;

public class UsePlDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usePlNum = request.getParameter("usePlNum");
		UsePlDAO uDao = UsePlDAO.getInstance();
		uDao.deleteUsePl(usePlNum);
		
	}

}
