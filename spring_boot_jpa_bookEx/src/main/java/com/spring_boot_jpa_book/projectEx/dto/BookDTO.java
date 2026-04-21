package com.spring_boot_jpa_book.projectEx.dto;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookDTO {
	private String bookNo;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookDate;
	private int bookStock;
	private String pubNo;
}
