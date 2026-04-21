package com.spring_boot_jpa_book.projectEx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;
import com.spring_boot_jpa_book.projectEx.entity.Book;
import com.spring_boot_jpa_book.projectEx.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {
	
	private final BookRepository bookRepository;

	@Override
	public List<BookDTO> listAllBook() {
		return bookRepository.findAll()
				.stream()
				.map(BookDTO::from)
				.toList();
	}

	@Override
	public void insertBook(BookDTO dto) {
		Book book = Book.toEntity(dto);
		bookRepository.save(book);
	}

	@Override
	public void updateBook(BookDTO dto) {
		Book book = Book.toEntity(dto);
        bookRepository.save(book);
	}

	@Override
	public void deleteBook(String bookNo) {
		bookRepository.deleteById(bookNo);
		
	}

	@Override
	public BookDTO detailViewBook(String bookNo) {
		Book book = bookRepository.findById(bookNo)
                .orElseThrow(() -> new RuntimeException("도서 정보가 없습니다"));
        return BookDTO.from(book);
	}
	
	

}
