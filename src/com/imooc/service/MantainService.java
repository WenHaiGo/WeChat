package com.imooc.service;

import com.imooc.dao.MessageDao;

/**
 * 维护相关业务
 */
public class MantainService {
	public void deleteOne(String id) {
		MessageDao messageDao = new MessageDao();
		if (id != null && !"".equals(id.trim())) {
			messageDao.deleteOne(Integer.parseInt(id));
		}
		
	}
}
