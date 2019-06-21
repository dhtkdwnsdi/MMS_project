package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트  신청 리스트 폼 액션
 *  
 */
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.vo.ProgrammerVO;
import com.mms.vo.ProjectVO;

public class ProjectApplyListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");
		String progNum = pVo.getProgNum();
		String url = "project/projectApplyListForm.jsp";
		
		ProjectDAO pDao = ProjectDAO.getInstance();
		ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
		list = pDao.projectApplyList(progNum);
		request.setAttribute("Plist", list);
		

		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
