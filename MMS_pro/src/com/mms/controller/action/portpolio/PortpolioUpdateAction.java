package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVO;

public class PortpolioUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String portNum = request.getParameter("portNum");
		request.setAttribute("portNum", portNum);
		
		String subject = request.getParameter("subject");
		request.setAttribute("subject", subject);
		
		String organization = request.getParameter("organization");
		request.setAttribute("organization", organization);
		
		String portCate = request.getParameter("portCate");
		request.setAttribute("portCate", portCate);
		
		String portDetailCate = request.getParameter("portDetailCate");
		request.setAttribute("portDetailCate", portDetailCate);
		
		String portContents = request.getParameter("portContents");
		request.setAttribute("portContents", portContents);
		
		String portStartDate = request.getParameter("portStartDate");
		request.setAttribute("portStartDate", portStartDate);
		
		String portEndDate = request.getParameter("portEndDate");
		request.setAttribute("portEndDate", portEndDate);
		
		String rate = request.getParameter("rate");
		request.setAttribute("rate", rate);
		
		String portFile = request.getParameter("portFile");
		request.setAttribute("portFile", portFile);
		
		String plNum = request.getParameter("plNum");
		request.setAttribute("plNum", plNum);
		
		
		PortpolioVO portVo = new PortpolioVO();
		
		portVo.setPortNum(portNum);
		portVo.setSubject(subject);
		portVo.setOrganization(organization);
		portVo.setPortCate(portCate);
		portVo.setPortDetailCate(portDetailCate);
		portVo.setPortContents(portContents);
		portVo.setPortStartDate(portStartDate);
		portVo.setPortEndDate(portEndDate);
		portVo.setRate(rate);
		portVo.setPortFile(portFile);
		portVo.setPlNum(plNum);
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		portDao.updatePortpolio(portVo);
		
		
		
		new ResumeFormAction().execute(request, response);
		

	}

}
