package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVo;

public class PortpolioModifyAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "prog?command=portpolioModifyForm";
		
		PortpolioVo portVo = new PortpolioVo();
		
		String portNum = request.getParameter("portNum");
		String subject = request.getParameter("subject");
		String portCate = request.getParameter("portCate");
		String portDetailCate = request.getParameter("port_DetailCate");
		String portStartDate = request.getParameter("portStartDate");
		String portEndDate = request.getParameter("portEndDate");
		String rate = request.getParameter("rate");
		String connectSkill = request.getParameter("connectSkill");
		String portContents = request.getParameter("portContents");
		String portFile = request.getParameter("portFile");

		
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
		
		request.setAttribute("portVo", portVo);
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		portDao.updatePortpolio(portVo);
		
		request.setAttribute("msg", "수정");
		
		request.setAttribute("portVo", portVo);
		
		new PortpolioListFormAction().execute(request, response);
	}

}
