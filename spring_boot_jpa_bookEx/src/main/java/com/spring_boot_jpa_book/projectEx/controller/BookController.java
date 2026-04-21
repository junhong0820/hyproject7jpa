package com.spring_boot_jpa_book.projectEx.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;



@Controller
public class BookController {

	@Autowired
	IBookService bookService;

	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}

	// 전체 도서 조회
	@RequestMapping("/book/listAllBook")
	public String listAllBook(Model model) {

		ArrayList<BookDTO> bookList = bookService.listAllBook();
		model.addAttribute("bookList", bookList);

		return "book/bookListView";
	}

	// 도서 등록 폼 열기
	@RequestMapping("/book/newBookForm")
	public String newBookForm() {
		return "book/newBookForm";
	}

	// 도서 등록
	@RequestMapping("/book/insertBook")
	public String insertBook(BookDTO dto) {
		bookService.insertBook(dto);
		return "redirect:/book/listAllBook";
	}

	// 도서 상세 정보 조회
	@RequestMapping("/book/detailViewBook/{bookNo}")
	public String detailViewBook(@PathVariable String bookNo, Model model) {

		BookDTO book = bookService.detailViewBook(bookNo);
		model.addAttribute("book", book);

		return "book/bookDetailView";
	}

	// 도서 정보 수정 화면 열기
	@RequestMapping("/book/updateBookForm/{bookNo}")
	public String updateBookForm(@PathVariable String bookNo, Model model) {

		BookDTO book = bookService.detailViewBook(bookNo);
		model.addAttribute("book", book);

		return "book/updatebookForm"; // 폼에 데이터 출력
	}

	// 수정된 데이터 받아서 DB에 저장
	@RequestMapping("book/updateBook")
	public String updateBook(BookDTO dto) {
		bookService.updateBook(vo);
		return "redirect:/book/listAllBook";
	}

	// 도서 정보 삭제
	@RequestMapping("/book/deleteBook/{bookNo}")
	public String deleteBook(@PathVariable String bookNo) {
		bookService.deleteBook(bookNo);
		return "redirect:/book/listAllBook";
	}

	// 도서 번호 중복 확인
	@ResponseBody
	@RequestMapping("/book/bookNoCheck")
	public String bookNoCheck(@RequestParam("bookNo") String bookNo) {

		String bookNo_result = bookService.bookNoCheck(bookNo);
		String result = "available";

		if (bookNo_result != null) {
			result = "not_available";
		}

		return result;
	}

	// 도서 검색 폼1 열기
	@RequestMapping("/book/bookSearchForm1")
	public String bookSearchForm1() {
		return "book/bookSearchForm1";
	}

	// 상품 검색 방법1
	@ResponseBody
	@RequestMapping("/book/bookSearch1")
	public ArrayList<BookDTO> productSearch1(@RequestParam HashMap<String, Object> param) {

		ArrayList<BookDTO> bookList = bookService.bookSearch(param);

		return bookList;
	}
	
	// 도서 검색 폼2 열기
	@RequestMapping("/book/bookSearchForm2")
	public String bookSearchForm2() {
		return "book/bookSearchForm2";
	}
	
	// 상품 검색 방법2
	@RequestMapping("/book/bookSearch2")
	public String productSearch2(@RequestParam HashMap<String, Object> param, Model model) {
		
		ArrayList<BookDTO> bookList = bookService.bookSearch(param);
		model.addAttribute("bookList", bookList);
		
		return "book/BookSearchResultView";
	}

}
