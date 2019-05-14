package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.MyCertDAO;
import com.mms.vo.MyCertVO;

public class MyCertUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String myCertNum = request.getParameter("myCertNum");
		request.setAttribute("myCertNum", myCertNum);
		
		String issueDate = request.getParameter("issueDate");
		request.setAttribute("issueDate", issueDate);
		
		String certSerial = request.getParameter("certSerial");
		request.setAttribute("certSerial", certSerial);
		
		MyCertVO myCertVo = new MyCertVO();
		
		myCertVo.setCertNum(myCertNum);
		myCertVo.setIssueDate(issueDate);
		myCertVo.setCertSerial(certSerial);
		
		MyCertDAO myCertDao = MyCertDAO.getInstance();
		myCertDao.updateMyCert(myCertVo);
		
		new MyCertListFormAction().execute(request, response);
	}

}
