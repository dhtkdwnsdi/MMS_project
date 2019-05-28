package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.SendMsgVO;

import util.DBManager;

public class SenderMsgDAO extends DBManager{
	
	private SenderMsgDAO() {

	}

	public static SenderMsgDAO instance = new SenderMsgDAO();

	public static SenderMsgDAO getInstance() {
		if (instance == null) {
			instance = new SenderMsgDAO();
		}
		return instance;
	}

	
	// 보낸 메일 불러오기
	public ArrayList<SendMsgVO> SendMessageList(String progNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "Select m.send_num"
				+ "		   , m.send_subject"
				+ "		   , p.name as send_receiver"
				+ "		   , m.send_write_date"
				+ "	    from tbl_send_msg m"
				+ "		   , tbl_programmer p"
				+ "    where send_receiver=p.prog_num"
				+ "	     and m.send_sender = ?";
		
		ArrayList<SendMsgVO> SendMessageList = new ArrayList<SendMsgVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();


			while (rs.next()) {
				SendMsgVO sVo = new SendMsgVO();
				sVo.setSendNum(rs.getString("send_Num"));
				sVo.setSendSubject(rs.getString("send_Subject"));
				sVo.setSendReceiver(rs.getString("send_receiver"));
				sVo.setSendWriteDate(rs.getString("send_Write_Date"));

				SendMessageList.add(sVo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return SendMessageList;
	}
	
	//보낸 메일 상세보기
	public SendMsgVO viewMessage(String sendNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SendMsgVO sVo = null;
		
		String sql = "select m.send_num"
				+ ",		 m.send_subject"
				+ ",		 m.send_write_date"
				+ ",		 m.send_contents"
				+ ",		 p.name as send_receiver"
				+"		from tbl_send_msg m"
				+ "		   , tbl_programmer p "
				+ "	   where send_num=? "
				+ "		 and send_receiver = p.prog_num";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sendNum);
			rs = pstmt.executeQuery();
			
			
			
			if (rs.next()) {
				sVo = new SendMsgVO();
				
				sVo.setSendNum(rs.getString("send_Num"));
				sVo.setSendSubject(rs.getString("send_Subject"));
				sVo.setSendWriteDate(rs.getString("send_Write_Date"));
				sVo.setSendReceiver(rs.getString("send_receiver"));
				sVo.setSendContents(rs.getString("send_Contents"));
				 

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sVo;
	}
	
	
	
	//등록
	public void insertMessage(SendMsgVO rVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into tbl_send_msg(send_num, send_subject, send_contents, send_receiver, send_sender) values (send_num,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rVo.getSendSubject());
			pstmt.setString(2, rVo.getSendContents());
			pstmt.setString(3, rVo.getSendReceiver());
			pstmt.setString(4, rVo.getSendSender());
			
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//삭제
	public int deleteMessage(String messageNumIndivi) {
		String sql = "delete from tbl_send_msg where send_num = ?";
		
		int res = 0;
		
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, messageNumIndivi);
			res=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return res;
	}

}

