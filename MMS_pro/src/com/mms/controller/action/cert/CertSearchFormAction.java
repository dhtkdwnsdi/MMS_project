package com.mms.controller.action.cert;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.CertDAO;
import com.mms.vo.CertVO;

public class CertSearchFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/profile/searchCertName.jsp";
		
		CertDAO certDao = CertDAO.getInstance();
		
		ArrayList<CertVO> certList = (ArrayList<CertVO>) certDao.selectCert();
		
		request.setAttribute("certList", certList);
		
		System.out.println(certList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	}

}
