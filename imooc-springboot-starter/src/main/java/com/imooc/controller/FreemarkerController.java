package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Resource;

@Controller
//@RestController//返回的就是字符串
@RequestMapping("/ftl")
public class FreemarkerController {

	@Autowired
	private Resource resource;

	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("resource", resource);
		return "freemarker/index";//后缀配置了
	}

	@RequestMapping("/center")
	public String center() {
		return "freemarker/center/center";
	}

}
