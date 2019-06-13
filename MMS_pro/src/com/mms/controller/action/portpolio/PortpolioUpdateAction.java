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
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		PortpolioVO portVo = (PortpolioVO) request.getAttribute("portVo");
		
		portDao.updatePortpolio(portVo);
		
		new ResumeFormAction().execute(request, response);
		

	}

}
