package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트 인력 저장 액션
 *  
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.dao.ProgrammerDAO;
import com.mms.vo.ApplyStmtVO;
import com.mms.vo.ProgrammerVO;

public class ProjectRecommendDeployAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] dProgNum = request.getParameterValues("dProgNum");
		String projNum = request.getParameter("projNum");
		
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		ApplyStmtVO aVo = new ApplyStmtVO();
		aVo.setProjNum(projNum);
		
		ProgrammerDAO pDao = ProgrammerDAO.getInstance();
		
		for (int i = 0; i < dProgNum.length; i++) {
			aVo.setProgNum(dProgNum[i]);
			aDao.recommendManpowerDeploy(aVo);
			pDao.updateState(dProgNum[i]);
		}
		
	}

}
