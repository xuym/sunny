package com.xym.sunny.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xym.sunny.user.dao.IUserDao;
import com.xym.sunny.user.dao.entity.User;


@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class IUserDaoTest {

	@Resource
	private IUserDao userDao;

	@Test
	public void testFindUserById() throws Exception {
		User user = userDao.findUserById(100);
		System.out.println(user);
	}

}
