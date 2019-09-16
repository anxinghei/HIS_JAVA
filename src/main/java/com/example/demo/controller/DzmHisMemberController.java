package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.DzmHisMember;
import com.example.demo.service.DzmHisMemberService;

@Controller
public class DzmHisMemberController  {

	@Autowired
	DzmHisMemberService memberService;
	
	@ResponseBody
	@RequestMapping("getOne")
	public String getOne2(String userName,String password) {
		DzmHisMember member=memberService.getOne("13946652480", "652480");
		System.out.println(member);
		return "success";
	}
}