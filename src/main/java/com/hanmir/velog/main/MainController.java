package com.hanmir.velog.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/")
	public String index() {
		return "main/index";
	}
	
	@RequestMapping(value="/home")
	public String home() {
		System.out.println("Hello World!!");
		
		return "main/home";
	}
}
