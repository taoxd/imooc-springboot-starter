package com.imooc.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

//@Controller
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUser")
	//@ResponseBody
	public User getUser() {
		User u = new User();
		u.setName("imooc3");
		u.setAge(19);
		u.setBirthday(new Date());
		u.setPassword("1234567");
		return u;
	}
	
	@RequestMapping("/getUserJson")
	//@ResponseBody
	public IMoocJSONResult getUserJson() {
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("123456");
		return IMoocJSONResult.ok(u);
	}

}
