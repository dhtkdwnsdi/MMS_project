package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ProjectVO;

public class ProjectRegistAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String url = "/proj?command=projListForm";
		
		//projectRegist.jsp에서 Parameter 가져오기
		String projName = request.getParameter("projName");
		String projCate = request.getParameter("projCate");
		String projDetailCate = request.getParameter("projDetailCate");
		String startDuedate = request.getParameter("startDuedate");
		String endDuedate = request.getParameter("endDuedate");
		String deadline = request.getParameter("deadline");
		String contents = request.getParameter("contents");
		String partiFormCode = request.getParameter("partiFormCode");
		String fwCode = request.getParameter("fwCode");
		String dbmsCode = request.getParameter("dbmsCode");
		String osCode = request.getParameter("osCode");
		String levelCode = request.getParameter("levelCode");
		String projFile = request.getParameter("projFile");
		String progNum = request.getParameter("progNum");
		
		//Parameter 출력
		System.out.println("projName : " + projName);
		System.out.println("projCate : " + projCate);
		System.out.println("projDetailCate : " + projDetailCate);
		System.out.println("startDuedate : " + startDuedate);
		System.out.println("endDuedate : " + endDuedate);
		System.out.println("deadline : " + deadline);
		System.out.println("contents : " + contents);
		System.out.println("partiFormCode : " + partiFormCode);
		System.out.println("fwCode : " + fwCode);
		System.out.println("dbmsCode : " + dbmsCode);
		System.out.println("osCode : " + osCode);
		System.out.println("levelCode : " + levelCode);
		System.out.println("projFile : " + projFile);
		System.out.println("progNum : " + progNum);
		
		// ProjectVO 객체 생성
		ProjectVO projVo = new ProjectVO();
		
		// 객체 세팅
		projVo.setProjName(projName);
		projVo.setProjCate(projCate);
		projVo.setProjDetailCate(projDetailCate);
		projVo.setStartDuedate(startDuedate);
		projVo.setEndDuedate(endDuedate);
		projVo.setDeadline(deadline);
		projVo.setContents(contents);
		projVo.setPartiFormCode(partiFormCode);
		projVo.setFwCode(fwCode);
		projVo.setDbmsCode(dbmsCode);
		projVo.setOsCode(osCode);
		projVo.setLevelCode(levelCode);
		projVo.setProjFile(projFile);
		projVo.setProgNum(progNum);
		
		// ProjectDAO 싱글톤패턴 객체 생성
		ProjectDAO projDao = ProjectDAO.getInstance();
		
		// projVo 객체 projDao 객체의 메소드에 담기
		projDao.insertProject(projVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
