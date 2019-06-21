package com.mms.controller.action.project;

/**
 *  @author LEE HAN
 *  
 *  프로젝트 사용프로그래밍 언어 검색 액션
 *  
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mms.controller.action.Action;
import com.mms.dao.PlDAO;
import com.mms.vo.PlVO;

public class SearchUsePlAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String value = request.getParameter("value");
		PlDAO plDao = PlDAO.getInstance();
		value = value.toUpperCase();
		
		ArrayList<PlVO> plList = plDao.searchPlList(value);
		
		String text = "[";
		
		
		
		
		for (int i = 0; i < plList.size(); i++) {
			String plnum = plList.get(i).getPlNum();
			String plname = plList.get(i).getPlName();
			text += "{\"plNum\":\"" + plnum + "\",\"plName\":\"" + plname + "\"},";
		}
			
		if(plList.size() > 0) {
			text = text.substring(0, text.length()-1);
		}
		text += "]";
			
			System.out.println(text);
			out.print(text);
		
		
		
		
	}

}
