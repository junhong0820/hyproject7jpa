package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;

public interface IBookService {
	public ArrayList<BookDTO> listAllBook();
	public void insertBook(BookDTO dto);
	public void updateBook(BookDTO dto);
	public void deleteBook(String bookNo);
	public BookDTO detailViewBook(String bookNo);
	public String bookNoCheck(String bookNo);
	public ArrayList<BookDTO> bookSearch(HashMap<String, Object> map);
}
