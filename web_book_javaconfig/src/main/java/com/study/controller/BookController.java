package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.dto.BookDTO;
import com.study.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/book/*")
public class BookController {

	@Autowired
	private BookService service;
	
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("도서전체목록요청");
		
		// 서비스 호출
		List<BookDTO> list = service.getList();
		
		// list
		model.addAttribute("list", list);
	}
	
	// 도서 입력 폼 보여주기
	@GetMapping("/insert")
	public void insert() {
		log.info("도서입력");
		
		// 도서입력요청
	}
	
	@PostMapping("/insert")
	public String insertPost(BookDTO insertDto) {
		log.info("도서 입력 정보 가져오기"+insertDto);
		
		try {
			if(service.bookInsert(insertDto)) {
				return "redirect:/book/list";
			}
		} catch (Exception e) {
			return "redirect:/book/insert";
		}
		
		return "redirect:/book/insert";
	}
}
