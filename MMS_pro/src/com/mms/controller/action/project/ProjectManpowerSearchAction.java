package com.mms.controller.action.project;
/**
 *  @author LEE HAN
 *  
 *  프로젝트 인력 검색 액션
 *  
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.vo.ApplyStmtVO;

public class ProjectManpowerSearchAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String projNum = request.getParameter("projNum");
		String category = request.getParameter("category");
		String keyword = request.getParameter("keyword");
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		ArrayList<ApplyStmtVO> searchList = new ArrayList<ApplyStmtVO>();
		
		if(category.equals("name")) {
			searchList = aDao.searchNameManpower(projNum, keyword);
		}
		else if(category.equals("id")) {
			searchList = aDao.searchIdManpower(projNum, keyword);
		}
		else if(category.equals("all")) {
			searchList = aDao.directDeploy(projNum);
		}
		
		request.setAttribute("searchList", searchList);
		
		String text = "[";
		
		for (int i = 0; i < searchList.size(); i++) {
			String progNum = searchList.get(i).getProgNum();
			String progName = searchList.get(i).getProgName();
			String Grade = searchList.get(i).getGrade();
				switch (Grade) {
				case "1":{
					Grade = "초급기능사";
					break;
				}
				case "2":{
					Grade = "중급기능사";
					break;
				}
				case "3":{
					Grade = "고급기능사";
					break;
				}
				case "4":{
					Grade = "초급기술자";
					break;
				}
				case "5":{
					Grade = "중급기술자";
					break;
				}
				case "6":{
					Grade = "고급기술자";
					break;
				}
				case "7":{
					Grade = "특급기술자";
					break;
				}
				case "8":{
					Grade = "기술자";
					break;
				}
					
				}
				
			
			String id = searchList.get(i).getId();
			//String plname = recommendList.get(i).getPlName();
			
			String plname = (searchList.get(i).getPlName() == null) ? "-" : searchList.get(i).getPlName();
			
			text += "{\"progNum\":\"" + progNum + "\",\"progName\":\"" + progName + "\",\"grade\":\"" + Grade + "\",\"id\":\"" + id + "\",\"plName\":\"" + plname +"\"},";
		}
			
		if(searchList.size() > 0) {
			text = text.substring(0, text.length()-1);
		}
		text += "]";
			
			System.out.println(text);
			out.print(text);
		
	}

}
