package com.xph.smvc.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xph.smvc.entity.User;
import com.xph.smvc.service.UserService;

@Controller
@RequestMapping(value = "/user")
// 根目录
public class UserController {

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/saveUser")
	public String saveUserUI() {
		return "addUser";
	}

	@RequestMapping(value = "/save")
	public String saveUser(@ModelAttribute("u") User u) {
		userService.saveUser(u);
		return "redirect:/user/list";

	}

	@RequestMapping(value = "/list")
	public String list(HttpServletRequest req) {

		List<User> users = userService.findAllUser();
		req.setAttribute("users", users);
		return "list";

	}

}
