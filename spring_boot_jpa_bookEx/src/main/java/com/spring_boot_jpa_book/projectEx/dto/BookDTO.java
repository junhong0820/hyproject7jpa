package com.spring_boot_jpa_book.projectEx.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.spring_boot_jpa_book.projectEx.entity.Book;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookDTO {
	
	private String bookNo;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date bookDate;
	private int bookStock;
	private String pubNo;
	
	public static BookDTO from(Book book) {
		return BookDTO.builder()
				.bookNo(book.getBookNo())
				.bookName(book.getBookName())
				.bookAuthor(book.getBookAuthor())
				.bookPrice(book.getBookPrice())
				.bookDate(book.getBookDate())
				.bookStock(book.getBookStock())
				.pubNo(book.getPubNo())
				.build();
	}
}
