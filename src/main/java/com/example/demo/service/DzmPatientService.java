package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.DzmPatient;
import com.example.demo.mapper.DzmPatientMapper;
//import com.github.wxiaoqi.security.common.biz.BaseBiz;

/**
 * 患者用户表
 *
 * @author Autumn
 * @email 
 * @date 2019-11-03 21:27:15
 */
@Service
public class DzmPatientService  {
	
	@Autowired
	private DzmPatientMapper patientMapper;
	
	public List<DzmPatient> getPatients(){
		return patientMapper.selectAll();
	}
	
	public DzmPatient getPatientById(int id) {
		return patientMapper.selectByPrimaryKey(id);
	}
	
}
