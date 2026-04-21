package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import com.spring_boot_jpa_book.projectEx.entity.BookEntity;

public interface IBookServiceDataHandle {
	public ArrayList<BookEntity> listAllBook();
	public void insertBook(BookEntity entity);
	public void updateBook(BookEntity entity);
	public void deleteBook(String bookNo);
	public Optional<BookEntity> detailViewBook(String bookNo);
	public String bookNoCheck(String bookNo);
	public ArrayList<BookEntity> bookSearch(HashMap<String, Object> map);
}
