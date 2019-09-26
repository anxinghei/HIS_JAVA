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
import com.example.demo.util.baiscData;

@Controller
public class DzmHisAuthRuleController {

	@Autowired
	private DzmHisAuthRuleService ruleService;
	@Autowired
	private DzmHisAuthGroupService authGroupService;
	
	@RequestMapping("toUpdateRules")
	public String toUpdateRules(Model model) {
// 得到修改权限集的角色
		DzmHisAuthGroup authGroup=authGroupService.findById(5);
		model.addAttribute("authGroup", authGroup);
		// 得到角色的权限集：String-->int[]
		String authString=authGroup.getRules();
		authString=authString.substring(1);
		System.out.println(authString);
		String[] ruleStrings=authString.split(",");
		int[] rulesInt=new int[ruleStrings.length];
		for (int i = 0; i < ruleStrings.length; i++) {
			rulesInt[i]=Integer.parseInt(ruleStrings[i]);
		}
		
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
			// 添加一级菜单:rulesMulti 添加的是single 的引用，若修改single ，结果集将发生变化-->修改single 的引用
			single=ruleService.getRulesByPropety("id",firstRules.get(i).getId());
			rulesMulti.add(single);
			// 添加二级菜单
			secondRules=ruleService.getRulesByPropety("pid",firstRules.get(i).getId());
			
			// 判定该权限是否为当前用户所有
			for (int j = 0; j < secondRules.size(); j++) {
				if (baiscData.in_array(secondRules.get(j).getId(), rulesInt)) {
					secondRules.get(j).setChecked(true);
				}
			}
			
			rulesMulti.add(secondRules);
		}
		model.addAttribute("rulesMulti", rulesMulti);
		return "rulesUpdating";
	}
}

