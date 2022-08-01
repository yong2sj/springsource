package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/*")
// 컨트롤러위에서는 get,postmapping 안됨
public class BoardController {

	/*
	 * localhost:9090/board/insert => insert.jsp localhost:9090/board/modify =>
	 * modify.jsp localhost:9090/board/read => read.jsp localhost:9090/board/list =>
	 * list.jsp
	 */	
	@GetMapping("/insert")
	public void insert() {
		log.info("insert....");
	}
	
//	@GetMapping("/modify")
//	public void modify() {
//		log.info("modify....");
//	}
	
//	@GetMapping("/read")
//	public void read() {
//		log.info("read....");
//	}
	
	@GetMapping(path = {"/read","modify"})
	public void read() {
		log.info("read.... or modify....");
	}
	
	@GetMapping("/list")
	public void list() {
		log.info("list....");
	}
}
