package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.DzmHisAuthGroup;
import com.example.demo.pojo.DzmHisPatientFile;
import com.example.demo.pojo.DzmPatient;
import com.example.demo.service.DzmHisPatientFileService;


@Controller
public class DzmPatientController {

	@Autowired 
	private com.example.demo.service.DzmPatientService patientService;
	@Autowired
	private DzmHisPatientFileService patientFileService;
	
	@RequestMapping("toPatients")
	public String toIndex(Model model) {
		List<DzmPatient> patients=patientService.getPatients();
		model.addAttribute("patients", patients);
		return "patient/index";
	}
	
	@RequestMapping("toEditPatient")
	public String toEditPatient(Integer patientId,Model model) {
		DzmPatient patient=patientService.getPatientById(patientId);
		model.addAttribute("patient", patient);
		DzmHisPatientFile patientFile=patientFileService.getFileByPatientId(patientId);
		model.addAttribute("patientFile", patientFile);
		String bloodString=patientFile.getBloodType();
		String[] bloodStrings=bloodString.split(",");
		System.out.println(bloodStrings[0]+"--"+bloodStrings[1]);
		model.addAttribute("bloodType", Integer.valueOf(bloodStrings[0]));
		model.addAttribute("RH", Integer.valueOf(bloodStrings[1]));
		return "patient/editPatient";
	}
	@RequestMapping("toFiles")
	public String toFiles(Integer patientId,Model model) {
		DzmPatient patient=patientService.getPatientById(patientId);
		model.addAttribute("patient", patient);
		return "patient/editPatient";
	}
}
