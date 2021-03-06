package com.example.demo.mapper;



import java.util.List;

import com.example.demo.pojo.DzmHisMember;
import com.example.demo.vo.member_doctorVO;

import tk.mybatis.mapper.common.Mapper;

/**
 * HIS用户表
 * 
 * @author Autumn
 * @email 
 * @date 2019-09-16 12:06:33
 */
public interface DzmHisMemberMapper extends Mapper<DzmHisMember> {
	public List<member_doctorVO> getVO();
}
