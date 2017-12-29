package com.xym.sunny.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.xym.sunny.base.entity.Response;
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

	@Override
	public Response<User> getUser(User user) {
		Response<User> response = new Response<User>();
		if(StringUtils.isEmpty(user.getUserName())) {
			response.setStatus("FAIL");
			response.setMessage("登录账号不能为空！");
		}else if(StringUtils.isEmpty(user.getPassword())) {
			response.setStatus("FAIL");
			response.setMessage("登录密码不能为空！");
		}else {
			User loginUser = userDao.getUser(user);
			response.getResult().setData(loginUser);
		}
		return response;
	}
}
