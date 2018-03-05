package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/**
 * @author hhhhhhh
 * 
 * 	列表业务相关功能
 *
 */
public class ListService {
	public List<Message> queryMessageList(String command, String description){
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
