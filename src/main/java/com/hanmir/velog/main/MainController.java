package com.hanmir.velog.main;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/")
	public String index(ModelMap model) {
		
		model.addAttribute("postCount", 5);
		
		return "main/index";
	}
	
	@RequestMapping(value="/recent")
	public String recent(ModelMap model) {
		
		model.addAttribute("postCount", 3);
		
		return "main/recent";
	}
	
	@RequestMapping(value="/search")
	public String search() {
		return "main/search";
	}
}
