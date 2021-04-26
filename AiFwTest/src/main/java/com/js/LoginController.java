package com.js;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping("/test")
	public String test1() {
		return "test1.html";
	}
	
	@ResponseBody
	@RequestMapping("/loginAjax")
	public String loginAjax(@RequestParam("id") String id,
											@RequestParam("pw") String pw	) {
		
		return id;		
	}
}
