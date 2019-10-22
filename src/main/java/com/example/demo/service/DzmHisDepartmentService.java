package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.DzmHisDepartment;
import com.example.demo.mapper.DzmHisDepartmentMapper;
//import com.github.wxiaoqi.security.common.biz.BaseBiz;

/**
 * 科室表
 *
 * @author Autumn
 * @email 
 * @date 2019-10-21 23:06:35
 */
@Service
public class DzmHisDepartmentService  {
	
	@Autowired
	DzmHisDepartmentMapper departmentMapper;
	
	public List<DzmHisDepartment> getAllDepartments() {
		return departmentMapper.selectAll();
	}
}
