package com.spring_boot_jpa_book.projectEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring_boot_jpa_book.projectEx.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, String> {
	
	@Query(value="SELECT b.bookNo From BookEntity b WHERE b.bookNo=:bookNo")
	public String searchById(@Param("bookNo") String bookNo);
}
