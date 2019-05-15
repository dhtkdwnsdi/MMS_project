package com.mms.controller.action.cert;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.CertDAO;
import com.mms.vo.CertVO;

public class CertRegistAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("regist action");
		String url = "/prog?command=certListForm";
		
		CertVO certVo = new CertVO();
		
		//요청받은 파라미터를 String에 세팅
		String certName = request.getParameter("certName");
		String issueOrg = request.getParameter("issueOrg");
		

        System.out.println("certName : " + certName);
        System.out.println("issueOrg : " + issueOrg);
		
		//객체 세팅
		certVo.setCertName(certName);
		certVo.setIssueOrg(issueOrg);
		
		//CertDAO로 인스턴스 불러오기
		CertDAO certDao = CertDAO.getInstance();
		certDao.insertCert(certVo);
		 
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
	}

}
