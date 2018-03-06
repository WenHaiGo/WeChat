package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

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

	public void deleteBatch(String[] ids) {
		MessageDao messageDao = new MessageDao();
		List<Integer> idList = new ArrayList<>();
		for(String id : ids)
		{
			idList.add(Integer.valueOf(id));
		}
		messageDao.deleteBatch(idList);
	}
}
