package com.imooc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser() {
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("123456");
		return u;
	}

}
