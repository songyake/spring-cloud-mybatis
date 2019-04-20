package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.mapper.UserMapper;
import com.test.pojo.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public PageInfo<User> queryUserList() {
		PageHelper.startPage(1, 3);
		return new PageInfo<User>(userMapper.queryUserList());
	}

}
