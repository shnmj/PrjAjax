package com.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// @Controller + @RequestMapping =  .jsp ,  .mustache → return view
// @Controller + @RequestMapping +  @ResponseBody = .jsp , .mustache를 찾지 않고 새 페이지에 data 출력
// @Controller + @ResponseBody   =  @RestController → 모든 함수에 @ResponseBody가 적용 (return data)
@Controller
public class MvcController {
	@RequestMapping("/mvc")
	public String mvc(Model model) {
		model.addAttribute("username", "SHIN");
		return "mvc";    // mvc.mustache 처리
	}
	@RequestMapping("/ajax1")
	public String ajax1(Model model) {
		String username = "SHIN";
		return username;
	}
	@RequestMapping("/ajax2")
	@ResponseBody
	public String ajax2(Model model) {
		String username = "<h2>SHIN<h2>";
		return username;
	}
}
