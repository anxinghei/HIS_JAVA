package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.DzmHisAuthGroup;
import com.example.demo.pojo.DzmHisPatientFile;
import com.example.demo.pojo.DzmPatient;
import com.example.demo.service.DzmHisPatientFileService;
import com.example.demo.service.DzmPatientService;
import com.example.demo.util.baiscData;


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
	
	@RequestMapping("editPatient/{patientId}")
	@ResponseBody
	public String editPatient(@PathVariable("patientId")int patientId,@RequestParam("name")String name,@RequestParam("sex")int sex,
			@RequestParam("id_card")String id_card,@RequestParam("miCard")String miCard,@RequestParam("address")String address,
			@RequestParam("allergy_info")String allergy_info,@RequestParam("emergency_contact_name")String emergency_contact_name,
			@RequestParam("emergency_contact_mobile")String emergency_contact_mobile,
			@RequestParam("emergency_contact_relation")int emergency_contact_relation,
			@RequestParam("left_ear_hearing")int left_ear_hearing,@RequestParam("right_ear_hearing")int right_ear_hearing,
			@RequestParam("left_version")BigDecimal left_version,@RequestParam("right_version")BigDecimal right_version,
			@RequestParam("height")BigDecimal height,@RequestParam("weight")BigDecimal weights,@RequestParam("blood_type")String blood_type,
			@RequestParam("Rh")String Rh,@RequestParam("personal_info")String personal_info,@RequestParam("family_info")String family_info) {
		DzmPatient patient=new DzmPatient(patientId, name, baiscData.getCurrentTime(), sex,  id_card, miCard, address, allergy_info);
		patientService.updetePatient(patient);
		DzmHisPatientFile patientFile=patientFileService.getFileByPatientId(patientId);
		int fileId=patientFile.getFileId();
		String bloodType=""+blood_type+","+Rh;
		patientFile=new DzmHisPatientFile(fileId, patientId, emergency_contact_name, emergency_contact_mobile, emergency_contact_relation, left_ear_hearing, right_ear_hearing, left_version, baiscData.getCurrentTime(), right_version, height, weights, bloodType, personal_info, family_info);
		patientFileService.updatePatientFile(patientFile);
		return "success";
	}
	
	@RequestMapping("toFiles")
	public String toFiles(Integer patientId,Model model) {
		DzmPatient patient=patientService.getPatientById(patientId);
		model.addAttribute("patient", patient);
		return "patient/editPatient";
	}
}
