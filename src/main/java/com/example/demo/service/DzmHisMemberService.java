package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DzmHisMemberMapper;
import com.example.demo.pojo.DzmHisMember;

/**
 * HIS用户表
 *
 * @author Autumn
 * @email 
 * @date 2019-09-16 12:06:33
 */
@Service
public class DzmHisMemberService  {
	@Autowired
	DzmHisMemberMapper memberMapper;
	
	public DzmHisMember getOne(String userName,String password) {
		DzmHisMember record=new DzmHisMember();
		record.setUserName(userName);
		record.setPassword(password);
		DzmHisMember member=memberMapper.selectOne(record);
		return member;
	}
}