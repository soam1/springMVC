package com.akashsoam.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("This is home controller");
		return "index";
	}
	
	@RequestMapping("/add")
//	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpSession session, Model m) {
	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpSession session, ModelMap m) {
		int num3 = i+j;
		m.addAttribute("num3", num3);
		return "result";
	}
}
