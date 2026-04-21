package com.spring_boot_jpa_book.projectEx.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor 
@AllArgsConstructor 
public class Book {
	
	@Id 
	private String bookNo;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date bookDate;
	private int bookStock;
	private String pubNo;
	
	public static Book toEntity(BookDTO dto) {
		return Book.builder()
				.bookNo(dto.getBookNo())
				.bookName(dto.getBookName())
				.bookAuthor(dto.getBookAuthor())
				.bookPrice(dto.getBookPrice())
				.bookDate(dto.getBookDate())
				.bookStock(dto.getBookStock())
				.pubNo(dto.getPubNo())
				.build();
	}

}
