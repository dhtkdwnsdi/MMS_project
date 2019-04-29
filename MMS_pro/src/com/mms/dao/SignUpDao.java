package com.mms.dao;

import com.mms.vo.ProgrammerVo;

import util.DBManager;

public class SignUpDao extends DBManager {

	private static SignUpDao instance;
	
	private SignUpDao() {
		
	}
	
	public static SignUpDao getInstance() {
		if(instance == null) {
			instance = new SignUpDao();
		}
		System.out.print("SignUpDao.java");
		return instance;
	}
	
	public void SignUp(ProgrammerVo proVo) {
		String sql = "";
	}
	
}
