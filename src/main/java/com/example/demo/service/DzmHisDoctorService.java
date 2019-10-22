package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.DzmHisDoctorMapper;
import com.example.demo.pojo.DzmHisDoctor;


/**
 * 医生基本信息表
 *
 * @author Autumn
 * @email 
 * @date 2019-10-08 16:57:43
 */
@Service
public class DzmHisDoctorService  {
	
	@Autowired
	DzmHisDoctorMapper doctorMapper;
	
	public void addDoctor(DzmHisDoctor record) {
		doctorMapper.insert(record);
	}
}