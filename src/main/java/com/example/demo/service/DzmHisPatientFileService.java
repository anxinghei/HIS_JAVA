package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.DzmHisPatientFile;
import com.example.demo.mapper.DzmHisPatientFileMapper;
//import com.github.wxiaoqi.security.common.biz.BaseBiz;

/**
 * 患者用户档案表
 *
 * @author Autumn
 * @email 
 * @date 2019-11-03 21:27:15
 */
@Service
public class DzmHisPatientFileService  {
	
	@Autowired
	private DzmHisPatientFileMapper patientFileMapper;
	
	public DzmHisPatientFile getFileByPatientId(int id) {
		DzmHisPatientFile record=new DzmHisPatientFile();
		record.setPatientId(id);
		return patientFileMapper.selectOne(record);
	}
	
	public void updatePatientFile(DzmHisPatientFile file) {
		patientFileMapper.updateByPrimaryKeySelective(file);
	}
}
