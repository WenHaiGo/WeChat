package com.imooc.db;

import java.io.IOException;
import java.io.Reader;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author hhhhhhh 访问数据库
 */
public class DBAccess {
	// 通过配置文件获取数据库数据

	public SqlSession getSqlSession() throws IOException {
		// 通过配置文件获取数据信息
		Reader reader = Resources.getResourceAsReader("com/imooc/config/Configuration.xml");
		// 通过配置信息构建一个SQLSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		// 通过sqlsessionFactory打开数据库会话
		SqlSession sqlSession = sqlSessionFactory.openSession();

		return sqlSession;

	}
}
