package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DzmHisAuthGroupMapper;
import com.example.demo.pojo.DzmHisAuthGroup;

import tk.mybatis.mapper.entity.Example;


/**
 * 用户组表
 *
 * @author Autumn
 * @email 
 * @date 2019-09-16 20:44:15
 */
@Service
public class DzmHisAuthGroupService {

	@Autowired
	DzmHisAuthGroupMapper authGroupMapper;
	
	public DzmHisAuthGroup findById(int id) {
		return authGroupMapper.selectByPrimaryKey(id);
	}
	
	public List<DzmHisAuthGroup> getAllGroups(){
		return authGroupMapper.selectAll();
	}
	
	public void updateGroup(DzmHisAuthGroup authGroup) {
		authGroupMapper.updateByPrimaryKeySelective(authGroup);
	}
}