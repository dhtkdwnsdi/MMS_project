package com.mms.controller.action.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.mms.controller.action.Action;
import com.mms.dao.PlDAO;
import com.mms.vo.PlVO;

public class SearchUsePlAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value = request.getParameter("value");
		PlDAO plDao = PlDAO.getInstance();
		value.toUpperCase();
		ArrayList<PlVO> plList = plDao.searchPlList(value);
		String text = "";
		
		for (int i = 0; i < plList.size(); i++) {
			String plNum = plList.get(i).getPlNum();
			String plName = plList.get(i).getPlName();
			text += "\"plNum\":\"" + plNum + "\",\"plName\":\"" + plName + "\"";
			System.out.println(text);
			
		}
		
		JSONArray list = new JSONArray();
		JSONObject object = new JSONObject();
		
		
		
		
	}

}
