package com.test.service;


import org.springframework.stereotype.Repository;
import com.github.pagehelper.PageInfo;
import com.test.pojo.User;

@Repository
public interface IUserService {
	
	public int insert(User user);
	
	public PageInfo<User> queryUserList();
	
}
