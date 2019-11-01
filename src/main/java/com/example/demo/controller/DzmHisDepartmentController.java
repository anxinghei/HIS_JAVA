package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.DzmHisDepartment;
import com.example.demo.service.DzmHisDepartmentService;
import com.example.demo.util.baiscData;

@Controller
public class DzmHisDepartmentController {

	@Autowired
	DzmHisDepartmentService departmentService;
	
	@RequestMapping("toDept")
	public String toIndex(Model model) {
		List<DzmHisDepartment> deptList=departmentService.getAllDepartments();
		model.addAttribute("Depts", deptList);
		return "department/index";
	}
	
	@RequestMapping(value = "addDept",method = RequestMethod.POST)
	@ResponseBody
	public String addDept(@RequestParam("departmentName")String departmentName,@RequestParam("departmentNumber")String departmentNumber) {
		DzmHisDepartment department=new DzmHisDepartment();
		department.setDepartmentName(departmentName);
		department.setDepartmentNumber(departmentNumber);
		department.setHid(1);
		department.setCreateTime(baiscData.getCurrentTime());
		department.setUpdateTime(baiscData.getCurrentTime());
		departmentService.addDept(department);
		return "success";
	}
	
	@RequestMapping("deleteDept/{did}")
	@ResponseBody
	public String deleteDept(@PathVariable("did")int did) {
		departmentService.deleteDept(did);
		return "success";
	}
	
	@RequestMapping("editDept/{did}")
	@ResponseBody
	public String editDept(@PathVariable("did")long did,@RequestParam("nameEdit")String nameEdit,@RequestParam("numberEdit")String numberEdit) {
		DzmHisDepartment department=new DzmHisDepartment();
		department.setDid(did);
		department.setDepartmentName(nameEdit);
		department.setDepartmentNumber(numberEdit);
		department.setUpdateTime(baiscData.getCurrentTime());
		departmentService.editDept(department);
		return "success";
	}
	@RequestMapping("getDept/{did}")
	@ResponseBody
	public DzmHisDepartment getDept(@PathVariable("did")int did) {
		DzmHisDepartment department= departmentService.getDept(did);
		return department;
	}
}
