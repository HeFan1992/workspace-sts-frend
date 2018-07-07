package com.alipay.rbac.controller;

import com.alipay.rbac.entity.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	String home(Model model, UserVO user) {
		model.addAttribute("user", user);
		return "index";
	}

	@RequestMapping(value ="/welcome", method = RequestMethod.GET)
	String welcome() {
	  return "welcome";
	}

	@RequestMapping(value ="/login", method = RequestMethod.GET)
	String login(Model model, UserVO user) {
	  model.addAttribute("user", user);
	  return "index";
	}
	
}
