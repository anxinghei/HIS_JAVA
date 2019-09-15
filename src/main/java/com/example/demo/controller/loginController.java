package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.Member;

@Controller
public class loginController {

	@RequestMapping("/")
	public String test() {
		return "login";
	}

	@ResponseBody
	@PutMapping("/member")
	public String addCategory(@RequestBody Member member)  {
		System.out.println("springboot接受到浏览器以JSON格式提交的数据：" + member);
		return "success";
	}
	@ResponseBody
	@GetMapping("/member2/{idd}")
	public String Category(@PathVariable("idd") int id) throws Exception {
		System.out.println("111111111111111");
		return "success";
	}
	
	@ResponseBody
	@GetMapping("/member3")
	public String Category3(@RequestParam("idd") int id) throws Exception {
		System.out.println("111111111111111");
		return "success";
	}


}
