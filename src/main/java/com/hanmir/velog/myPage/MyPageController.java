package com.hanmir.velog.myPage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	
	public static final int URI_SEPARATOR_AUTHOR = 1;
	public static final int URI_SEPARATOR_TYPE = 2;
	
	@RequestMapping(value="/@*")
	public String myPage(ModelMap model, HttpServletRequest request) {
		String requestUri = request.getRequestURI();
		
		String[] uriArray = requestUri.split("/");
		String[] authorArray = uriArray[URI_SEPARATOR_AUTHOR].split("@");
		String author = authorArray[URI_SEPARATOR_AUTHOR];
		
		model.addAttribute("hello", author);
		
		return "myPage/myPage";
	}
	
	@RequestMapping(value="/@*/*")
	public String myPageReturnHandler(ModelMap model, HttpServletRequest request) {
		String requestUri = request.getRequestURI();
		
		String[] uriArray = requestUri.split("/");
		String[] authorArray = uriArray[URI_SEPARATOR_AUTHOR].split("@");
		String author = authorArray[URI_SEPARATOR_AUTHOR];
		String uriInfo = uriArray[URI_SEPARATOR_TYPE];
		
		if(uriInfo.equals("series")) {
			return "myPage/series";
		} else if(uriInfo.equals("about")) {
			return "myPage/about";
		} else {
			return "myPage/post";
		}
	}
}