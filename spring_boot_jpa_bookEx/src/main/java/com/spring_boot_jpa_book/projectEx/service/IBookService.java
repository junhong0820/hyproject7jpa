package com.spring_boot_jpa_book.projectEx.service;

import java.util.List;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;

public interface IBookService {
	
	//전체 도서 조회
	List<BookDTO> listAllBook();
	//도서 정보 등록
	void insertBook(BookDTO dto);
	//도서 정보 수정
	void updateBook(BookDTO dto);
	//도서 정보 삭제
	void deleteBook(String bookNo);
	//상세 도서 조회
	BookDTO detailViewBook(String bookNo);
}
