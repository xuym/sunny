package com.xym.sunny.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xym.sunny.base.entity.Response;
import com.xym.sunny.user.dao.entity.User;
import com.xym.sunny.user.service.IUserService;

/**
 * 用户Controller层
 * @author Xym
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private transient IUserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(@RequestBody User user) {
		return userService.regist(user);
	}
	
	@ResponseBody
	@RequestMapping(value = "/isExistUser", method = RequestMethod.POST)
	public Object isExistUser(@RequestBody User user) {
		return userService.isExistUser(user);
	}
	
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Response<User> login(@RequestBody User user) {
		return userService.getUser(user);
	}

}
