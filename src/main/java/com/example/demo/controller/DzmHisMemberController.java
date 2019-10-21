package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.DzmHisAuthGroup;
import com.example.demo.pojo.DzmHisMember;
import com.example.demo.service.DzmHisMemberService;
import com.example.demo.vo.member_doctorVO;

@Controller
public class DzmHisMemberController  {

	@Autowired
	DzmHisMemberService memberService;
	
	@RequestMapping("toMembers")
	public String toIndex(Model model) {
		List<member_doctorVO> vos=memberService.getVOs();
		model.addAttribute("vos",vos);
		return "member/index";
	}
	
	@RequestMapping("getVO")
	@ResponseBody
	public List<member_doctorVO>  getVO() {
		return memberService.getVOs();
	}
}