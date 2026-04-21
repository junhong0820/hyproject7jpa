package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot_jpa_book.projectEx.dao.IBookDAO;
import com.spring_boot_jpa_book.projectEx.entity.BookEntity;

import jakarta.transaction.Transactional;

@Service
@Primary
@Transactional
public class BookServiceDataHandle implements IBookServiceDataHandle {
	@Autowired
	IBookDAO dao;

	@Override
	public ArrayList<BookEntity> listAllBook() {
		return dao.listAllBook();
	}

	@Override
	public void insertBook(BookEntity entity) {
		dao.insertBook(entity);
	}

	@Override
	public void updateBook(BookEntity entity) {
		dao.updateBook(entity);	
	}

	@Override
	public void deleteBook(String bookNo) {
		dao.deleteBook(bookNo);
	}

	@Override
	public Optional<BookEntity> detailViewBook(String bookNo) {
		return dao.detailViewBook(bookNo);
	}

	@Override
	public String bookNoCheck(String bookNo) {
		return dao.bookNoCheck(bookNo);
	}

	@Override
	public ArrayList<BookEntity> bookSearch(HashMap<String, Object> map) {
		return dao.bookSearch(map);
	}

}
