package com.xym.sunny.user.dao;

import com.xym.sunny.user.dao.entity.User;

/**
 * dao接口
 * @author xym
 *
 */
public interface IUserDao {
  
    /**	
     * 根据id查询用户信息
     */
    public User findUserById(int id);
    
    /**
     * 根据用户名、邮箱、手机号查询用户
     * @param user User 对象
     * @return User
     */
    public User findUser(User user);
    
    /**
     * 插入一条用户信息
     * @param user User实体类
     * @return Integer
     */
    public Integer insert(User user);
    
    /**
     * 登录
     * @param user User
     * @return User对象
     */
    public User getUser(User user);
    
   
}
