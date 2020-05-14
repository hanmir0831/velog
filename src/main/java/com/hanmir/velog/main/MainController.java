package com.hanmir.velog.main;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hanmir.velog.main.service.MainService;

@Controller
public class MainController {

	@Resource(name = "mainService")
	private MainService mainService;
	
	@RequestMapping(value="/")
	public String index(ModelMap model) {
		
		HashMap map = mainService.getPostCount();
		
		model.addAttribute("data", map.get("postCount"));
		
		return "main/index";
	}
	
	@RequestMapping(value="/recent")
	public String recent(ModelMap model) {
		
		return "main/recent";
	}
	
	@RequestMapping(value="/search")
	public String search() {
		return "main/search";
	}
	
	@RequestMapping(value="/vue")
	public String vueTest()  {
		return "vue/index";
	}
}
