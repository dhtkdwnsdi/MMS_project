package com.mms.controller.action.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.dao.ProjectDAO;
import com.mms.dao.UsePlDAO;
import com.mms.vo.ApplyStmtVO;
import com.mms.vo.ProjectVO;
import com.mms.vo.UsePlVO;

public class ProjectRegisterAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = 0;
		
		ProjectDAO pDao = ProjectDAO.getInstance();
		ProjectVO pVo = (ProjectVO) request.getAttribute("pVo");
		
		String[] plNum = (String[]) request.getAttribute("plNum");
		
		res = pDao.registerProject(pVo);

		if(res != 0) {
			String projNum = String.valueOf(res);
			UsePlDAO uDao = UsePlDAO.getInstance();
			UsePlVO uVo = new UsePlVO();
			uVo.setProjNum(projNum);
			for (int i = 0; i < plNum.length; i++) {
				uVo.setPlNum(plNum[i]);
				uDao.insertUsePl(uVo);
			}
			
			ApplyStmtVO aVo = new ApplyStmtVO();
			ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
			aVo.setApplyPosition("PM");
			aVo.setApplyStat("승인");
			aVo.setProgNum(pVo.getProgNum());
			aVo.setProjNum(projNum);
			aDao.insertPMApplyStmt(aVo);
		
		}
		
		
		new MyProjectListFormAction().execute(request, response);
		
	}

}
