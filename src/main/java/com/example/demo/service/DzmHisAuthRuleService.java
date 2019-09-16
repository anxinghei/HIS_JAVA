package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DzmHisAuthRuleMapper;
import com.example.demo.pojo.DzmHisAuthRule;

/**
 * 用户权限表
 *
 * @author Autumn
 * @email 
 * @date 2019-09-16 21:20:20
 */
@Service
public class DzmHisAuthRuleService  {
	@Autowired
	private DzmHisAuthRuleMapper authRuleMapper;
	
	public DzmHisAuthRule findById(int key) {
		return authRuleMapper.selectByPrimaryKey(key);
	}
	
}