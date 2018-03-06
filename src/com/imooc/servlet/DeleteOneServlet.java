package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.service.ListService;
import com.imooc.service.MantainService;

/**
 * 单条删除控制层
 */
public class DeleteOneServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置编码
		req.setCharacterEncoding("utf-8");
		// 接受页面的值
		String id = req.getParameter("id");
		MantainService mantainService = new MantainService();
		mantainService.deleteOne(id);
		// 查询消息并且传给页面
		// 向页面跳转
		req.getRequestDispatcher("/List.Action").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
