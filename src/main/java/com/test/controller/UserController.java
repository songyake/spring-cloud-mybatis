package com.test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.test.pojo.User;
import com.test.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping("/queryUserList")
	@ResponseBody
	public List<User> queryUserList(){
		PageInfo<User> pageInfo = userService.queryUserList();
		return pageInfo.getList();
	}
}
