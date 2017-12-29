package com.xym.sunny.user.service;

import com.xym.sunny.base.entity.Response;
import com.xym.sunny.user.dao.entity.User;

/**
 * 用户模块Service接口类
 * @author Xym
 *
 */
public interface IUserService {
	/**
	 * 注册
	 * @param user User对象
	 * @return
	 */
	String regist(User user);
	
	/**
	 * 根据用户名、邮箱、手机号查找用户是否存在
	 * @param user User对象
	 * @return boolean
	 */
	boolean isExistUser(User user);
	
	/**
	 * 登录
	 * @param user User
	 * @return 用户对象
	 */
	Response<User> getUser(User user);

}
