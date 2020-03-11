package com.mms.controller.action.myCert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.MyCertDAO;
import com.mms.vo.MyCertVO;

public class MyCertRegistAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String progNum = request.getParameter("progNum");
		String certNum = request.getParameter("certNum");
		String issueDate = request.getParameter("issueDate");
		String certSerial = request.getParameter("certSerial");
		
		MyCertVO myCertVo = new MyCertVO();
		MyCertDAO myCertDao = MyCertDAO.getInstance();
		
		myCertVo.setProgNum(progNum);
		myCertVo.setCertNum(certNum);
		myCertVo.setIssueDate(issueDate);
		myCertVo.setCertSerial(certSerial);
		
		myCertDao.insertMyCert(myCertVo);
		
		new ResumeFormAction().execute(request, response);
	}

}
