package com.study.myapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.myapp.dto.BookDTO;
import com.study.myapp.service.BookService;
import com.study.myapp.service.BookServiceImpl;

public class BookMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		BookService service = (BookService) ctx.getBean("service");

		// 자바코드
		// BookService service = new BookServiceImpl();
		// List<BookDTO> list = service.getList();
		
		// 도서 정보 삽입
		BookDTO insertDto = new BookDTO(2000,"spring","yh",10000);
		System.out.println(service.bookInsert(insertDto)?"삽입성공":"삽입실패");
		
		// 도서 리스트 출력
		List<BookDTO> list = service.getList();
		for(BookDTO dto : list) {
			System.out.println(dto);
		}
	}
}
