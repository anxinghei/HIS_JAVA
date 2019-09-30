package com.example.demo.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.DzmHisMember;

@Controller
public class loginController {

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String toLogin(Model model) {
		Subject subject = SecurityUtils.getSubject();	
		System.out.println(subject.isRemembered());
		System.out.println(subject.isAuthenticated());
		if(subject.isRemembered()){
			System.out.println("-------------------------------------------------");
            System.out.println("认证成功");
            DzmHisMember member = (DzmHisMember)subject.getPrincipal();
            model.addAttribute("member",member);
            return "redirect:/toHome";
        }
		return "login";
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(String userName,String password,boolean rememberMe,Model model)  {
		/**
		 * 使用Shiro编写认证操作
		 */
//1.获取Subject
		Subject subject = SecurityUtils.getSubject();	
//2.封装用户数据
		UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
//3.执行登录方法
		try {
			System.out.println(rememberMe);
			token.setRememberMe(rememberMe);
			subject.login(token);
			//登录成功，跳转到主页面
			return "redirect:/toHome";
		} catch (UnknownAccountException e) {
			//登录失败:用户名不存在
			model.addAttribute("msg", "用户名不存在");
			return "login";
		}catch (IncorrectCredentialsException e) {
			//登录失败:密码错误
			model.addAttribute("msg", "密码错误");
			return "login";
		}
	}
	
	@RequestMapping("/toHome")
	public String toHome() {
		return "home";
	}
}
