package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mapper.DzmHisDepartmentMapper;
import com.example.demo.pojo.DzmHisAuthGroup;
import com.example.demo.pojo.DzmHisDepartment;
import com.example.demo.pojo.DzmHisDoctor;
import com.example.demo.pojo.DzmHisMember;
import com.example.demo.service.DzmHisAuthGroupService;
import com.example.demo.service.DzmHisDepartmentService;
import com.example.demo.service.DzmHisDoctorService;
import com.example.demo.service.DzmHisMemberService;
import com.example.demo.vo.member_doctorVO;

@Controller
public class DzmHisMemberController  {

	@Autowired
	private DzmHisMemberService memberService;
	@Autowired
	private DzmHisDepartmentService departmentService;
	@Autowired
	private DzmHisAuthGroupService authGroupService;
	@Autowired
	private DzmHisDoctorService doctorService;
	
	@RequestMapping("toMembers")
	public String toIndex(Model model) {
		List<member_doctorVO> vos=memberService.getVOs();
		model.addAttribute("vos",vos);
		List<DzmHisDepartment> departments=departmentService.getAllDepartments();
		model.addAttribute("departments",departments);
		List<DzmHisAuthGroup> groups=authGroupService.getAllGroups();
		model.addAttribute("groups",groups);
		return "member/index";
	}
	
	@RequestMapping(value = "addMember",method = RequestMethod.POST)
	public String addMember(@RequestParam("trueName")String trueName,@RequestParam("department_id")int department_id,@RequestParam("title")int title,
							@RequestParam("phone")String phone,@RequestParam("sex")int sex,@RequestParam("age")int age) {
	    SimpleDateFormat ft = new SimpleDateFormat ("yyyyMMdd" );	    
	    int time=Integer.valueOf(ft.format(new Date()));
		DzmHisMember member=new DzmHisMember(phone, phone, time,1, 1, title, time);
		memberService.addMember(member);
		int uid=memberService.getOne(phone, phone).getUid();
		DzmHisDoctor doctor=new DzmHisDoctor(trueName, age, sex, phone, time, time, uid, department_id,0);
		doctorService.addDoctor(doctor);
		return "member/index";
	}
	
	@RequestMapping(value = "deleteMember/{did}",method = RequestMethod.POST)
	public String deleteMember(@PathVariable("did") int did) {
		DzmHisDoctor doctor=doctorService.findById(did);
		System.out.println(doctor.getTrueName());
		doctorService.deleteDoctor(did);
		memberService.deleteMember(doctor.getUid());
		return "member/index";
	}
	
	@RequestMapping(value = "editY/{did}",method = RequestMethod.POST)
	public String editY(@PathVariable("did") int did) {
		DzmHisDoctor doctor=doctorService.findById(did);
		DzmHisMember member=memberService.findById(doctor.getUid());
		member.setStatus(1);
		memberService.updateMember(member);
		return "member/index";
	}
	
	@RequestMapping(value = "editN/{did}",method = RequestMethod.POST)
	public String editN(@PathVariable("did") int did) {
		DzmHisDoctor doctor=doctorService.findById(did);
		DzmHisMember member=memberService.findById(doctor.getUid());
		member.setStatus(2);
		memberService.updateMember(member);
		return "member/index";
	}
	
}