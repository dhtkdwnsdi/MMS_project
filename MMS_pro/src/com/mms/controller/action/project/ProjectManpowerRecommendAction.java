package com.mms.controller.action.project;
/**
 * @author LEE HAN
 * 
 * 프로젝트 인력을 추천하는 액션
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.ApplyStmtDAO;
import com.mms.vo.ApplyStmtVO;

public class ProjectManpowerRecommendAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String[] plName = request.getParameterValues("plName");	
		String grade = request.getParameter("grade");
		
		ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
		ArrayList<ApplyStmtVO> recommendList = aDao.recommendList(grade, plName);
		request.setAttribute("recommendList", recommendList);
		String text = "[";
		
		for (int i = 0; i < recommendList.size(); i++) {
			String progNum = recommendList.get(i).getProgNum();
			String progName = recommendList.get(i).getProgName();
			String Grade = recommendList.get(i).getGrade();
				switch (Grade) {
				case "1":{
					Grade = "초급기능사";
					break;
				}
				case "2":{
					Grade = "중급기능사	";
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
				
			
			String id = recommendList.get(i).getId();
			String plname = recommendList.get(i).getPlName();
			text += "{\"progNum\":\"" + progNum + "\",\"progName\":\"" + progName + "\",\"grade\":\"" + Grade + "\",\"id\":\"" + id + "\",\"plName\":\"" + plname +"\"},";
		}
			
		if(recommendList.size() > 0) {
			text = text.substring(0, text.length()-1);
		}
		text += "]";
			
			System.out.println(text);
			out.print(text);
	

	}

}
