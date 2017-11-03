package com.xym.sunny.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xym.sunny.user.dao.IUserDao;
import com.xym.sunny.user.dao.entity.User;
import com.xym.sunny.user.service.IUserService;

/**
 * 用户模块Service实现类
 * @author Xym
 *
 */
@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private transient IUserDao userDao;

	public String regist(User user) {
		Integer id = userDao.insert(user);
		return "OK";
	}

	@Override
	public boolean isExistUser(User u) {
		User user = userDao.findUser(u);
		if(user == null) {
			return false;
		}
		return true;
	}

}
