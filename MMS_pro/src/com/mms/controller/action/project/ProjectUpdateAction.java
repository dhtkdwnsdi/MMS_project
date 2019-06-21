package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트 수정 액션
 *  
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ProjectDAO;
import com.mms.dao.UsePlDAO;
import com.mms.vo.ProjectVO;
import com.mms.vo.UsePlVO;

public class ProjectUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProjectDAO pDao = ProjectDAO.getInstance();
		ProjectVO pVo = (ProjectVO) request.getAttribute("pVo");
		String[] plNum = (String[]) request.getAttribute("plNum");
		String projNum = (String) request.getAttribute("projNum");

		UsePlDAO uDao = UsePlDAO.getInstance();
		uDao.projectDeleteUsePl(projNum);
		
		UsePlVO uVo = new UsePlVO();
		uVo.setProjNum(projNum);
		
		for (int i = 0; i < plNum.length; i++) {
			uVo.setPlNum(plNum[i]);
			uDao.insertUsePl(uVo);
		}
		
		
		pDao.updateProject(pVo);
		
	}

}
