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

		
//		String projName = request.getParameter("projName");
//		String projCate = request.getParameter("projCate");
//		String projDetailCate = request.getParameter("projDetailCate");
//		String startDuedate = request.getParameter("startDuedate");
//		String endDuedate = request.getParameter("endDuedate");
//		String deadline = request.getParameter("deadline");
//		String contents = request.getParameter("contents");
//		String partiFormCode = request.getParameter("partiFormCode");
//		String fwCode = request.getParameter("fwCode");
//		String dbmsCode = request.getParameter("dbmsCode");
//		String osCode = request.getParameter("osCode");
//		String levelCode = request.getParameter("levelCode");
//		String projFile = request.getParameter("projFile");
//		String progNum = request.getParameter("progNum");
		
//		ProjectVO pVo = new ProjectVO();
//		pVo.setProjName(projName);
//		pVo.setProjCate(projCate);
//		pVo.setProjDetailCate(projDetailCate);
//		pVo.setStartDuedate(startDuedate);
//		pVo.setEndDuedate(endDuedate);
//		pVo.setDeadline(deadline);
//		pVo.setContents(contents);
//		pVo.setPartiFormCode(partiFormCode);
//		pVo.setFwCode(fwCode);
//		pVo.setDbmsCode(dbmsCode);
//		pVo.setOsCode(osCode);
//		pVo.setLevelCode(levelCode);
//		pVo.setProjFile(projFile);
//		pVo.setProgNum(progNum);
		
//		System.out.println(pVo);
		
//		ProjectDAO pDao = ProjectDAO.getInstance();
//		pDao.registerProject(pVo);
		
		ProjectDAO pDao = ProjectDAO.getInstance();
		ProjectVO pVo = (ProjectVO) request.getAttribute("pVo");
		System.out.println("pVo: " + pVo);
		
		pDao.registerProject(pVo);
		
		new ProjectListFormAction().execute(request, response);
		
	}

}
