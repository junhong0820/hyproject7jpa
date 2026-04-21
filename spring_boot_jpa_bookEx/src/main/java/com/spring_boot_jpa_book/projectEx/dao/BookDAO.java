package com.spring_boot_jpa_book.projectEx.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot_jpa_book.projectEx.entity.BookEntity;
import com.spring_boot_jpa_book.projectEx.repository.BookRepository;

@Service
@Primary
public class BookDAO implements IBookDAO {
	@Autowired
	BookRepository bookRepo;

	@Override
	public ArrayList<BookEntity> listAllBook() {
		return (ArrayList<BookEntity>)bookRepo.findAll();
	}

	@Override
	public void insertBook(BookEntity entity) {
		bookRepo.save(entity);
	}

	@Override
	public void updateBook(BookEntity entity) {
		bookRepo.save(entity);
	}

	@Override
	public void deleteBook(String bookNo) {
		bookRepo.deleteById(bookNo);
	}

	@Override
	public Optional<BookEntity> detailViewBook(String bookNo) {
		return bookRepo.findById(bookNo);
	}

	@Override
	public String bookNoCheck(String bookNo) {
		return bookRepo.searchById(bookNo);
	}

	@Override
	public ArrayList<BookEntity> bookSearch(HashMap<String, Object> map) {
		return null;
	}

}
