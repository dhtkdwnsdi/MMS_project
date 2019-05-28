package com.mms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mms.vo.ReceiveMsgVO;

import util.DBManager;

public class ReceiverMsgDAO extends DBManager{
	
	private ReceiverMsgDAO() {

	}

	public static ReceiverMsgDAO instance = new ReceiverMsgDAO();

	public static ReceiverMsgDAO getInstance() {
		if (instance == null) {
			instance = new ReceiverMsgDAO();
		}
		return instance;
	}

	
	// 수신 목록 리스트
	public ArrayList<ReceiveMsgVO> ReceiveMessageList(String progNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "Select m.receive_num"
				+ "		   , m.receive_subject"
				+ "		   , p.name as receive_sender"
				+ "		   , m.receive_write_date"
				+ "	    from tbl_receive_msg m"
				+ "		   , tbl_programmer p"
				+ "    where receive_sender=p.prog_num"
				+ "	     and m.receive_receiver = ?";
		
		ArrayList<ReceiveMsgVO> ReceiveMessageList = new ArrayList<ReceiveMsgVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progNum);
			rs = pstmt.executeQuery();


			while (rs.next()) {
				ReceiveMsgVO rVo = new ReceiveMsgVO();
				rVo.setReceiveNum(rs.getString("receive_Num"));
				rVo.setReceiveSubject(rs.getString("receive_Subject"));
				rVo.setReceiveSender(rs.getString("receive_sender"));
				rVo.setReceiveWriteDate(rs.getString("receive_Write_Date"));

				ReceiveMessageList.add(rVo);
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
		return ReceiveMessageList;
	}
	
	//받은 메일 상세보기
	public ReceiveMsgVO viewMessage(String receiveNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ReceiveMsgVO rVo = null;
		
		String sql = "select m.receive_num"
				+",			 m.receive_subject"
				+",			 m.receive_write_date"
				+",			 m.receive_contents"
				+",		     p.name as receive_sender"
				+"		from tbl_receive_msg m"
				+", 		 tbl_programmer p "
				+ "	   where receive_num=? "
				+ "      and receive_sender = p.prog_num";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, receiveNum);
			rs = pstmt.executeQuery();
			
			
			
			while (rs.next()) {
				rVo = new ReceiveMsgVO();
				 
				rVo.setReceiveNum(rs.getString("receive_num"));
				rVo.setReceiveSubject(rs.getString("receive_subject"));
				rVo.setReceiveWriteDate(rs.getString("receive_write_date"));
				rVo.setReceiveContents(rs.getString("receive_contents"));
				rVo.setReceiveSender(rs.getString("receive_sender"));

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
		return rVo;
	}
	
	
	
	//등록
	public void insertMessage(ReceiveMsgVO rVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into tbl_receive_msg(receive_subject, receive_contents, receive_receiver, receive_sender) values (?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rVo.getReceiveSubject());
			pstmt.setString(2, rVo.getReceiveContents());
			pstmt.setString(3, rVo.getReceiveReceiver());
			pstmt.setString(4, rVo.getReceiveSender());
			
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
		String sql = "delete from tbl_receive_msg where receive_num = ?";
		
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
