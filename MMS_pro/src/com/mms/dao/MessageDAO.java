package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mms.vo.MessageVO;
import com.mms.vo.ProgrammerVO;

import util.DBManager;

public class MessageDAO extends DBManager {

	private MessageDAO() {

	}

	public static MessageDAO instance = new MessageDAO();

	public static MessageDAO getInstance() {
		if (instance == null) {
			instance = new MessageDAO();
		}
		return instance;
	}

	/*
	 * // list public ArrayList<MessageVO> messageList(String progNum) { Connection
	 * conn = null; PreparedStatement pstmt = null; ResultSet rs = null;
	 * 
	 * 
	 * String sql =
	 * "select message_num, msg_subject, sender, write_date from tbl_message where receiver = "
	 * + progNum; ArrayList<MessageVO> list = new ArrayList<MessageVO>();
	 * 
	 * try { conn = getConnection(); pstmt = conn.prepareStatement(sql); rs =
	 * pstmt.executeQuery();
	 * 
	 * 
	 * while (rs.next()) { MessageVO mVo = new MessageVO();
	 * 
	 * mVo.setMessageNum(rs.getString("message_num"));
	 * mVo.setMsgSubject(rs.getString("msg_subject")); //
	 * mVo.setMessageContents(rs.getString("message_contents"));
	 * mVo.setWriteDate(rs.getString("write_date"));
	 * mVo.setReceiver(rs.getString("receiver"));
	 * mVo.setSender(rs.getString("sender"));
	 * 
	 * list.add(mVo); } } catch (SQLException e) { e.printStackTrace(); } finally {
	 * try { if (rs != null) rs.close(); if (pstmt != null) pstmt.close(); if (conn
	 * != null) conn.close(); } catch (Exception e) { e.printStackTrace(); } }
	 * return list; }
	 */
	// 수신 목록 리스트
	public ArrayList<MessageVO> sendMessageList(String progNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "Select m.message_num as message_num"
				+ "		   , m.msg_subject as msg_subject"
				+ "		   , p.name as receiver"
				+ "		   , m.write_date as write_date"
				+ "	    from tbl_message m"
				+ "		   , tbl_programmer p"
				+ "    where m.receiver=p.prog_num"
				+ "	     and m.sender = ?";
		ArrayList<MessageVO> sendMessageList = new ArrayList<MessageVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();


			while (rs.next()) {
				MessageVO mVo = new MessageVO();
				mVo.setMessageNum(rs.getString("message_num"));
				mVo.setMsgSubject(rs.getString("msg_subject"));
				// mVo.setMessageContents(rs.getString("message_contents"));
				mVo.setWriteDate(rs.getString("write_date"));
				mVo.setReceiver(rs.getString("receiver"));
				/* mVo.setSender(rs.getString("sender")); */

				sendMessageList.add(mVo);
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
		return sendMessageList;
	}

//발신 목록 리스트
	public ArrayList<MessageVO> receiveMessageList(String progNum) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "Select m.message_num as message_num"
				+ "		   , m.msg_subject as msg_subject"
				+ "		   , p.name as sender"
				+ "		   , m.write_date as write_date"
				+ "		from tbl_message m, tbl_programmer p where m.sender=p.prog_num and m.receiver = ? ";
		
		ArrayList<MessageVO> receiveMessageList = new ArrayList<MessageVO>();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();
			
			
			while (rs.next()) {
				MessageVO mVo = new MessageVO();
				mVo.setMessageNum(rs.getString("message_num"));
				mVo.setMsgSubject(rs.getString("msg_subject"));
				// mVo.setMessageContents(rs.getString("message_contents"));
				mVo.setWriteDate(rs.getString("write_date"));
				/* mVo.setReceiver(rs.getString("receiver")); */
				mVo.setSender(rs.getString("sender"));

				receiveMessageList.add(mVo);
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
		return receiveMessageList;
	}
	
	//상세보기
	public MessageVO viewMessage(String messageNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MessageVO mVo = null;
		
		String sql = "select m.message_num, m.msg_subject, m.write_date, m.message_contents, p.prog_name as sender, p.prog_name as receiver"
					+"		from message m, programmer p where message_num=? and m.receiver = p.prog_num";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			pstmt.setString(1, messageNum);
			
			while (rs.next()) {
				mVo = new MessageVO();
				 
				mVo.setMessageNum(rs.getString("message_num"));
				mVo.setMsgSubject(rs.getString("msg_subject"));
				mVo.setMessageContents(rs.getString("message_contents"));
				mVo.setWriteDate(rs.getString("write_date"));
				mVo.setReceiver(rs.getString("receiver"));
				mVo.setSender(rs.getString("sender"));

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
		return mVo;
	}
	
	//등록
	public void insertMessage(MessageVO mVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into tbl_message(message_num, msg_subject, write_date, message_contents, receiver, sender) values (message_num, ?,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getMsgSubject());
			pstmt.setString(2, mVo.getWriteDate());
			pstmt.setString(3, mVo.getMessageContents());
			pstmt.setString(4, mVo.getReceiver());
			pstmt.setString(5, mVo.getSender());
			
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
	
	
	
}
