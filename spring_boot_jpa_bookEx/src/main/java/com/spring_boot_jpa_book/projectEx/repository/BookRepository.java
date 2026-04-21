package com.spring_boot_jpa_book.projectEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot_jpa_book.projectEx.entity.Book;

public interface BookRepository extends JpaRepository<Book, String>{

}
