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
		
		PortpolioVO portVo = (PortpolioVO) request.getAttribute("portVo");
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		System.out.println("portpolioUpdate : "+portVo);
		
		portDao.updatePortpolio(portVo);
		
		

	}

}
