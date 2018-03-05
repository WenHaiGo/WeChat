package com.imooc.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Message;
import com.imooc.db.DBAccess;

/**
 * @author hhhhhhh
 * 
 *         操作Message数据库的操作类
 *
 */
public class MessageDao {

	public List<Message> queryMessageList(String command, String description) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<Message> messageList = new ArrayList<>();
		try {
			sqlSession = dbAccess.getSqlSession();
			//通过sqlsession执行sql语句
			messageList = sqlSession.selectList("Message.queryMessageList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (sqlSession != null) {
				sqlSession.close();
			}

		}
		return messageList;
	}

	// 根据条件查询
	// public List<Message> queryMessageList(String command, String description) {
	// List<Message> messageList = new LinkedList<>();
	// Connection conn = null;
	// ResultSet rs = null;
	// PreparedStatement pstm = null;
	// try {
	// Class.forName("com.mysql.jdbc.Driver");
	// conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql",
	// "root", "123456");
	// StringBuilder sql = new StringBuilder("select ID,COMMAND,DESCRIPTION,CONTENT
	// from message where 1=1");
	// List<String> paramList = new LinkedList<String>();
	// if (command != null && !"".equals(command.trim())) {
	// sql.append(" and COMMAND=?");
	// paramList.add(command);
	//
	// }
	// // 这里感觉trim()
	// if (description != null && !"".equals(description.trim())) {
	// sql.append(" and DESCRIPTION like '%' ? '%'");
	// paramList.add(description);
	// }
	// pstm = conn.prepareStatement(sql.toString());
	// for (int i = 0; i < paramList.size(); i++) {
	// System.out.println("dsa" + paramList.get(i));
	// pstm.setString(i + 1, paramList.get(i).trim());
	// }
	// rs = pstm.executeQuery();
	// while (rs.next()) {
	// Message message = new Message();
	// message.setCommand(rs.getString("COMMAND"));
	// message.setContent(rs.getString("CONTENT"));
	// message.setDescription(rs.getString("DESCRIPTION"));
	// message.setId(rs.getInt("ID"));
	// messageList.add(message);
	// }
	//
	// } catch (ClassNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return messageList;
	// }
}
