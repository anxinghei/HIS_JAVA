package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DzmHisAuthGroupMapper;
import com.example.demo.pojo.DzmHisAuthGroup;


/**
 * 用户组表
 *
 * @author Autumn
 * @email 
 * @date 2019-09-16 20:44:15
 */
@Service
public class DzmHisAuthGroupService  {

	@Autowired
	DzmHisAuthGroupMapper authGroupMapper;
	
	public DzmHisAuthGroup findById(int id) {
		return authGroupMapper.selectByPrimaryKey(id);
	}
}