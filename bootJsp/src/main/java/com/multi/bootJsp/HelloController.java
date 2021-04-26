package com.multi.bootJsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody
	@RequestMapping("/")  // 요청 URL : http://localhost:8080
	public String hello() {
		return "Hello BootJSP";
	}
	
	@RequestMapping("/hello")
	public String helloMsg(Model model) {
		model.addAttribute("message", "안녕하세요.");
		return "hello"; // 뷰 페이지 이름 : hello.jsp
	}
}
