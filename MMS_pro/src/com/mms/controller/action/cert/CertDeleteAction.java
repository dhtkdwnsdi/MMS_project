package com.mms.controller.action.cert;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.CertDAO;
import com.mms.vo.CertVO;

public class CertDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "prog?command=certListForm";
		
		CertVO certVo = new CertVO();
		
		String certNum = request.getParameter("certNum");
		certVo.setCertNum(certNum);
		
		CertDAO certDao = CertDAO.getInstance();
		
		certDao.deleteCert(certNum);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
