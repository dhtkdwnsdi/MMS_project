package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ProjectVO;

public class ProjectRegisterAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProjectDAO pDao = ProjectDAO.getInstance();
		ProjectVO pVo = (ProjectVO) request.getAttribute("pVo");
		System.out.println("pVo: " + pVo);
		
		pDao.registerProject(pVo);
		
		
	}

}
