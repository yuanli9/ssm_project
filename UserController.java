package com.ssm.yuanli.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.yuanli.entity.User;
import com.ssm.yuanli.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		User userResult = userService.login(user);
		
		if(userResult == null){
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "login";
		}else{
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", userResult);
			return "redirect:/main.jsp";
		}
	}
}
