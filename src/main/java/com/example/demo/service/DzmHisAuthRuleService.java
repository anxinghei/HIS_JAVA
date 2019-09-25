package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DzmHisAuthRuleMapper;
import com.example.demo.pojo.DzmHisAuthRule;

import tk.mybatis.mapper.entity.Example;

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
	
	public List<DzmHisAuthRule> getRulesByPropety(String propety,int value){
		Example example=new Example(DzmHisAuthRule.class);
		example.and().andEqualTo(propety, value);
		return authRuleMapper.selectByExample(example);
	}
	

	
}