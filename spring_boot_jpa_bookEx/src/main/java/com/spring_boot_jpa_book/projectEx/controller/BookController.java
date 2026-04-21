package com.spring_boot_jpa_book.projectEx.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;
import com.spring_boot_jpa_book.projectEx.service.IBookService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookController {
	
	private final IBookService bookService;
	
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	
	// 전체 도서 조회
    @GetMapping("/book/listAllBook")
    public String listAllBook(Model model) {
        List<BookDTO> bookList = bookService.listAllBook();
        model.addAttribute("bookList", bookList);
        return "book/bookListView";
    }

    // 도서 등록 폼 열기
    @GetMapping("/book/newBookForm")
    public String newBookForm(Model model) {
        model.addAttribute("bookDTO", BookDTO.builder().build());
        return "book/newBookForm";
    }

    // 도서 등록
    @PostMapping("/book/insertBook")
    public String insertBook(@ModelAttribute BookDTO dto) {
        bookService.insertBook(dto);
        return "redirect:/book/listAllBook";
    }

    // 상세 도서 조회
    @GetMapping("/book/detailViewBook/{bookNo}")
    public String detailViewBook(@PathVariable("bookNo") String bookNo, Model model) {
        BookDTO book = bookService.detailViewBook(bookNo);
        model.addAttribute("book", book);
        return "book/bookDetailView";
    }

    // 수정 폼 열기
    @GetMapping("/book/updateBookForm/{bookNo}")
    public String updateBookForm(@PathVariable("bookNo") String bookNo, Model model) {
        BookDTO book = bookService.detailViewBook(bookNo);
        model.addAttribute("bookDTO", book);
        return "book/updateBookForm";
    }

    // 도서 수정
    @PostMapping("/book/updateBook")
    public String updateBook(@ModelAttribute BookDTO dto) {
        bookService.updateBook(dto);
        return "redirect:/book/detailViewBook/" + dto.getBookNo();
    }

    // 도서 삭제
    @GetMapping("/book/deleteBook/{bookNo}")
    public String deleteBook(@PathVariable("bookNo") String bookNo) {
        bookService.deleteBook(bookNo);
        return "redirect:/book/listAllBook";
    }
	

}
