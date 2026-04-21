package com.spring_boot_jpa_book.projectEx.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;

public interface IBookDAO {
	
	// 전체 도서 조회
		public ArrayList<BookDTO> listAllBook();

		// 도서 정보 등록
		public void insertBook(BookDTO vo);

		// 도서 정보 수정
		public void updateBook(BookDTO vo);

		// 도서 정보 삭제
		public void deleteBook(String bookNo);

		// 도서 상품 정보 조회
		public BookDTO detailViewBook(String bookNo);
		
		// 도서 번호 중복 체크
		public String bookNoCheck(String bookNo);
		
		// 상품 검색
		public ArrayList<BookDTO> bookSearch(HashMap<String, Object> map);
		
}
