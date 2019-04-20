package com.test.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.pojo.User;

@Repository
public interface UserMapper {
	
	public int insert(User user);
	
	public List<User> queryUserList();
	
}
