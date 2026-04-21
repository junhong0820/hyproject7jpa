package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;
import com.spring_boot_jpa_book.projectEx.entity.BookEntity;

@Service
@Primary
public class BookService implements IBookService {
	@Autowired
	IBookServiceDataHandle bookServiceDataHandle;

	@Override
	public ArrayList<BookDTO> listAllBook() {
		ArrayList<BookEntity> entityList = bookServiceDataHandle.listAllBook();
		ArrayList<BookDTO> dtoList = new ArrayList<BookDTO>();

		for (BookEntity entity : entityList) {
			BookDTO dto = BookDTO.toDTO(entity);
			dtoList.add(dto);
		}

		return dtoList;
	}

	@Override
	public void insertBook(BookDTO dto) {
		BookEntity entity = BookEntity.toEntity(dto);
		bookServiceDataHandle.insertBook(entity);
	}

	@Override
	public void updateBook(BookDTO dto) {
		BookEntity entity = BookEntity.toEntity(dto);
		bookServiceDataHandle.updateBook(entity);
	}

	@Override
	public void deleteBook(String bookNo) {
		bookServiceDataHandle.deleteBook(bookNo);
	}

	@Override
	public BookDTO detailViewBook(String bookNo) {
		Optional<BookEntity> entity = bookServiceDataHandle.detailViewBook(bookNo);
		BookDTO dto = BookDTO.toDTO(entity.get());
		return dto;
	}

	@Override
	public String bookNoCheck(String bookNo) {
		return bookServiceDataHandle.bookNoCheck(bookNo);
	}

	@Override
	public ArrayList<BookDTO> bookSearch(HashMap<String, Object> map) {
		ArrayList<BookEntity> entityList = bookServiceDataHandle.bookSearch(map);
		ArrayList<BookDTO> dtoList = new ArrayList<BookDTO>();

		for (BookEntity entity : entityList) {
			BookDTO dto = BookDTO.toDTO(entity);
			dtoList.add(dto);
		}

		return dtoList;
	}
}
