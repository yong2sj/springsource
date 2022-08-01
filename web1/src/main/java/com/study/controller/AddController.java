package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.dto.NumDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/calc/*")
public class AddController {

	@GetMapping("/add")
	public void addGet() {
		log.info("add.jsp 페이지 요청");
	}
	
	//@PostMapping("/add")
	//public void addPost(@RequestParam("num1") int op1,@RequestParam("num2") int op2) {
	//	log.info("덧셈 요청");
	//	log.info("num1 + num2 = "+(num1+num2));
	//	log.info("num1 + num2 = "+(op1+op2));
	//}
	
	//@PostMapping("/add")
	//public void addPost(@RequestParam(value="num1",required=false,defaultValue="0") int num1,
	//		@RequestParam(value="num2",required=false,defaultValue="0") int num2) {
	//	log.info("덧셈 요청");
	//	log.info("num1 + num2 = "+(num1+num2));
	//}
	
	@PostMapping("/add")
	public void addPost(NumDTO dto) {
		log.info("덧셈요청");
		log.info("num1+num2="+(dto.getNum1()+dto.getNum2()));
	}
}
