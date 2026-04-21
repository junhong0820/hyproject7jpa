package com.spring_boot_jpa_book.projectEx.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.spring_boot_jpa_book.projectEx.entity.BookEntity;

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
	
	// Entity -> DTO 변환 메소드
	public static BookDTO toDTO(BookEntity entity) {
		return BookDTO.builder()
				.bookNo(entity.getBookNo())
				.bookName(entity.getBookName())
				.bookAuthor(entity.getBookAuthor())
				.bookPrice(entity.getBookPrice())
				.bookDate(entity.getBookDate())
				.bookStock(entity.getBookStock())
				.pubNo(entity.getPubNo())
				.build();
	}
}
