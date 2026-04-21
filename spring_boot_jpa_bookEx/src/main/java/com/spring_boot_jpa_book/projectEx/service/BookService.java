package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot_jpa_book.projectEx.dao.IBookDAO;
import com.spring_boot_jpa_book.projectEx.dto.BookDTO;

@Service
@Primary
public class BookService implements IBookService {


	@Autowired
	@Qualifier("IBookDAO")
	IBookDAO dao;
	
	@Override
	public ArrayList<BookDTO> listAllBook() {
		return dao.listAllBook();
	}

	@Override
	public void insertBook(BookDTO dto) {
		dao.insertBook(dto);
	}

	@Override
	public void updateBook(BookDTO dto) {
		dao.updateBook(dto);
	}

	@Override
	public void deleteBook(String bookNo) {
		dao.deleteBook(bookNo);

	}

	@Override
	public BookDTO detailViewBook(String bookNo) {
		return dao.detailViewBook(bookNo);
	}
	
	@Override
	public String bookNoCheck(String bookNo) {
		return dao.bookNoCheck(bookNo);
	}
	
	@Override
	public ArrayList<BookDTO> bookSearch(HashMap<String, Object> map) {
		return dao.bookSearch(map);
	}
}
