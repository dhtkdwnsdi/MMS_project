package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVO;

public class PortpolioRegisterAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		//parameter가져오기
		String subject = request.getParameter("subject");
		String organization = request.getParameter("organization");
		String portCate = request.getParameter("portCate");
		String portDetailCate = request.getParameter("portDetailCate");
		String portContents = request.getParameter("portContents");
		String portStartDate = request.getParameter("portStartDate");
		String portEndDate = request.getParameter("portEndDate");
		String rate = request.getParameter("rate");
		String portFile = request.getParameter("portFile");
		String plNum = request.getParameter("plNum");

		PortpolioVO portVo = new PortpolioVO();
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		portVo.setSubject(subject);
		portVo.setOrganization(organization);
		portVo.setPortCate(portCate);
		portVo.setPortDetailCate(portDetailCate);
		portVo.setPortStartDate(portStartDate);
		portVo.setPortContents(portContents);
		portVo.setPortEndDate(portEndDate);
		portVo.setRate(rate);
		portVo.setPortFile(portFile);
		portVo.setPlNum(plNum);
		
		
		portDao.insertPortpolio(portVo);
		
		
		new ResumeFormAction().execute(request, response);
		
	}

}
