package com.green.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.dto.UserDto;

// 이 페이지의 모든 함수는 전부 @ResponseBody로 작동 (데이터만 return)
// 1. 데이터 전송 표준 → soap protocol 방식 : xml
// 2. 데이터 전송 표준 → rest api      방식 : json/xml

// @RestController : @Controller + @ResponseBody body가 있어서 문자열 데이터로 출력 (json으로 return) 
@RestController
public class DataServerController {
	@RequestMapping("/ajax3")
	public String ajax3() {
		String username = "SHIN";
		return username;   // json으로 변경돼서 출력되야 함
		
	}
	
	// UserDto class 를 추가 후 실행
	// java 객체 : new UserDto(userid, userpass, username)
	// json lib 작동함(legacy에선 이걸 추가해야 작동함)
	// js 객체   : {"userid": "shin", "userpass": "1234", "username": "SHIN" }
	@RequestMapping("/ajax4")
	public UserDto ajax4() {
		String  userid   = "shin";
		String  userpass = "1234";
		String  username = "SHIN";
		UserDto user     = new UserDto(userid, userpass, username);
		return  user;   // json으로 변경돼서 출력되야 함
		
	}
}
