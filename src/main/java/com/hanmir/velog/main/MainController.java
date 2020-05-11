package com.hanmir.velog.main;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/")
	public String index() {
		return "main/index";
	}
	
	@RequestMapping(value="/recent")
	public String home() {
		System.out.println("Hello World!!");
		return "main/recent";
	}
}
