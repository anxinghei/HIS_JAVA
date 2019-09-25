package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.DzmHisAuthGroup;
import com.example.demo.pojo.DzmHisAuthRule;
import com.example.demo.service.DzmHisAuthGroupService;
import com.example.demo.service.DzmHisAuthRuleService;

@Controller
public class DzmHisAuthRuleController {

	@Autowired
	private DzmHisAuthRuleService ruleService;
	@Autowired
	private DzmHisAuthGroupService authGroupService;
	
	@RequestMapping("toUpdateRules")
	public String toUpdateRules(Model model) {
// 得到修改权限集的角色
		DzmHisAuthGroup authGroup=authGroupService.findById(1);
		model.addAttribute("authGroup", authGroup);
// 得到一级菜单
		List<DzmHisAuthRule> firstRules=ruleService.getRulesByPropety("pid",0);
// 得到一级菜单下的二级菜单，并将一二级菜单保存起来
		// 最终的权限集合
		List<List<DzmHisAuthRule>> rulesMulti=new ArrayList<>();
		// 二级菜单的 List 集合，存放每个一级菜单下的二级菜单，用完就换
		List<DzmHisAuthRule> secondRules=new ArrayList<>();
		// 一级菜单的 List 集合，只放一个元素，用完就换
		List<DzmHisAuthRule> single=new ArrayList<DzmHisAuthRule>();
		for (int i=0;i<firstRules.size();i++) {
			// 添加一级菜单
			single=ruleService.getRulesByPropety("id",firstRules.get(i).getId());
			rulesMulti.add(single);
			// 添加二级菜单
			secondRules=ruleService.getRulesByPropety("pid",firstRules.get(i).getId());
			rulesMulti.add(secondRules);
			System.out.println(rulesMulti);
		}
		model.addAttribute("rulesMulti", rulesMulti);
		model.addAttribute("firstRules", firstRules);
		return "rulesUpdating";
	}
}

