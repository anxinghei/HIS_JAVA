package com.example.demo.service;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DzmHisMemberMapper;
import com.example.demo.pojo.DzmHisMember;
import com.example.demo.vo.member_doctorVO;
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
		return memberMapper.selectOne(record);
	}
	
	public DzmHisMember findByName(String name) {
		DzmHisMember record=new DzmHisMember();
		record.setUserName(name);
		return memberMapper.selectOne(record);
	}

	public DzmHisMember findById(int id) {
		return memberMapper.selectByPrimaryKey(id);
	}
	
	public List<DzmHisMember> getAllMembers(){
		return memberMapper.selectAll();
	}
	
	public void updateMember(DzmHisMember member) {
		memberMapper.updateByPrimaryKeySelective(member);
	}
	public void addMember(DzmHisMember member) {
		memberMapper.insert(member);
	}
	public void deleteMember(int id) {
		memberMapper.deleteByPrimaryKey(id);
	}
	public List<member_doctorVO> getVOs() {
		return memberMapper.getVO();
	}
}