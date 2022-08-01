package com.study.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.dto.UserDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/sample/*")	// http://localhost:9090/sample/**
public class SampleController {
	
	// 앞쪽 고정 : /WEB-INF/views
	// 뒷쪽 고정 : .jsp
	
	// 컨트롤러의 리턴타입이 void인 경우
	// http://localhost:9090/ 다음부분이 jsp 페이지를 찾는데 사용됨
	
	// 컨트롤러의 리턴타입이 String인 경우
	// return 값만을 가지고 jsp 페이지를 찾음
	
	//@RequestMapping(path = "/basic", method=RequestMethod.GET) // http://localhost:9090/sample/basic
	@GetMapping("/basic")
	public void basic(){
		log.info("basic....");
	}
	// Controller 파라미터 수집
	// 1. 변수명 사용
	// 2. DTO 객체 사용
	// 3. HttpServletRequest 객체 사용(필요할 경우만... 대부분 사용 잘 안함)
	
	// @RequestParam("이름") : 파라미터로 사용된 변수의 이름과 전달되는 파라미터의 이름이 다른 경우 사용 
	
	// GET + POST 둘 다 허용 
	// HTTP 405에러 Request method 'POST' not supported
	// -> 컨트롤러의 method 확인해보자
	//@RequestMapping(path = "/login", method = RequestMethod.GET) // http://localhost:9090/sample/login
	@GetMapping("/login")
	public void login() {
		log.info("login....");
	}
	
	// java.lang.IllegalStateException: Ambiguous mapping.
	// -> 똑같은 요청방식(method)로 url 중복되는 경우

	//@RequestMapping(path = "/login", method = RequestMethod.POST) // http://localhost:9090/sample/login
	
	//@PostMapping("/login")
	//public void loginPost(String userid, String password, String addr) {
	//	log.info("login POST"+userid+" "+password+" "+addr);
	//}
	//@PostMapping("/login")
	//public void loginPost(UserDTO userDto) {
	//	log.info("loginPOST.... "+userDto.getUserid()+" "+userDto.getPassword()+" "+userDto.getAddr()+" "+userDto.getAge());
	//}
	
	@PostMapping("/login")
	public void loginPost(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		String addr = request.getParameter("addr");
		String age = request.getParameter("age");
		
		log.info("login Post..."+userid+" "+password+" "+addr+" "+age);
	}
	
	//@RequestMapping(path = "/doA", method=RequestMethod.GET)
	@GetMapping("/doA")
	public void doA(String userid) {
		log.info("doA...."+userid);
	}
	
	//@RequestMapping(value = "/insert", method=RequestMethod.GET)
	@GetMapping("/insert")
	public String insert(@RequestParam("ids") ArrayList<String> ids) {
		log.info("insert...."+ids);
		return "insert"; //String 경우 문자그대로로 찾음
	}
}
