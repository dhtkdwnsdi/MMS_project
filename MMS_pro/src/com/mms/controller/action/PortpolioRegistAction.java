package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVo;

public class PortpolioRegistAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url="/prog?command=portpolioListForm";
		
		//jsp에서 parameter가져오기
		String portNum = request.getParameter("portNum");
		String subject = request.getParameter("subject");
		String portCate = request.getParameter("portCate");
		String portDetailCate = request.getParameter("portDetailCate");
		String portStartDate = request.getParameter("portStartDate");
		String portEndDate = request.getParameter("portEndDate");
		String rate = request.getParameter("rate");
		String connectSkill = request.getParameter("connectSkill");
		String portContents = request.getParameter("portContents");
		String portFile = request.getParameter("portFile");
		String progNum = request.getParameter("progNum");
		
		//parameter 출력
		System.out.println("portNum : " + portNum);
		System.out.println("subject : " + subject);
		System.out.println("portCate : " + portCate);
		System.out.println("portDetail : " + portDetailCate);
		System.out.println("portStartDate : " + portStartDate);
		System.out.println("portEndDate : " + portEndDate);
		System.out.println("rate : " + rate);
		System.out.println("connectSkill : " + connectSkill);
		System.out.println("portContents : " + portContents);
		System.out.println("portFile : " + portFile);
		System.out.println("progNum : " + progNum);
		
		PortpolioVo portVo = new PortpolioVo();
		
		portVo.setPortNum(portNum);
		portVo.setSubject(subject);
		portVo.setPortCate(portCate);
		portVo.setPortDetailCate(portDetailCate);
		portVo.setPortStartDate(portStartDate);
		portVo.setPortEndDate(portEndDate);
		portVo.setRate(rate);
		portVo.setConnectSkill(connectSkill);
		portVo.setPortContents(portContents);
		portVo.setPortFile(portFile);
		portVo.setProgNum(progNum);
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		portDao.insertPortpolio(portVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
