package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.DzmHisAuthGroup;
import com.example.demo.pojo.DzmHisAuthRule;
import com.example.demo.pojo.DzmHisMember;
import com.example.demo.service.DzmHisAuthGroupService;
import com.example.demo.service.DzmHisAuthRuleService;
import com.example.demo.shiro.UserRealm;
import com.example.demo.util.baiscData;

import redis.clients.jedis.Jedis;

@Controller
public class DzmHisAuthGroupController {

	@Autowired
	private DzmHisAuthRuleService ruleService;
	@Autowired
	private DzmHisAuthGroupService authGroupService;
	
	@RequestMapping("listGroups")
	public String editRuleGroup(Model model) {
		List<DzmHisAuthGroup> groups=authGroupService.getAllGroups();
		model.addAttribute("groups", groups);
		return "rules/listGroups";
	}
	
	@RequestMapping("toUpdateRules")
	public String toUpdateRules(Model model,Integer id) {
// 得到修改权限集的角色
		DzmHisAuthGroup authGroup=authGroupService.findById(id);
		model.addAttribute("authGroup", authGroup);
		// 得到角色的权限集：String-->int[]
		String authString=authGroup.getRules();
		int[] rulesInt=baiscData.splitString(authString);
		
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
		return "rules/editRules";
	}

	@RequestMapping(value = "/UpdateRules/{authGroup_id}",method = RequestMethod.POST)
	@ResponseBody
	public String updateRules(@PathVariable("authGroup_id") int authGroup_id,@RequestParam("rules") int[] rules) {
		Set set=new TreeSet();
		List<DzmHisAuthRule> rulesList=new ArrayList<DzmHisAuthRule>();
		int ruleID;
		DzmHisAuthRule rule=new DzmHisAuthRule();
		for (int i = 0; i < rules.length; i++) {
			ruleID=rules[i];
			// 父权限
			rule=ruleService.findById(ruleID);
			set.add(rule.getPid());
			// 选中的权限
			set.add(ruleID);
			// 子权限
			rulesList=ruleService.getRulesByPropety("pid",ruleID);
			for (DzmHisAuthRule dzmHisAuthRule : rulesList) {
				set.add(dzmHisAuthRule.getId());
			}
        }
		// 得到权限集:int[]-->String
		String ruleString="";
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			ruleString+=","+iterator.next();
		}
		// 更新权限组
		DzmHisAuthGroup authGroup=new DzmHisAuthGroup();
		authGroup.setId(authGroup_id);
		authGroup.setRules(ruleString);
		authGroupService.updateGroup(authGroup);
		// 若当前用户有权限修改的权限，其又将该权限删除，由于缓存的缘故，在其在线时仍拥有该权限
		// 解决办法：1、清除缓存	  2、权限修改的权限只由管理员持有，而管理员权限无法修改
		return "success";
	}
}

