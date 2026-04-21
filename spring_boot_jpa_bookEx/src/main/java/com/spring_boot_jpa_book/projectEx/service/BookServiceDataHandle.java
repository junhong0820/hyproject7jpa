package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring_boot_jpa_book.projectEx.entity.BookEntity;
import com.spring_boot_jpa_book.projectEx.repository.BookRepository;

@Service
@Transactional // DB 작업의 원자성을 보장합니다.
public class BookServiceDataHandle implements IBookServiceDataHandle {

    @Autowired
    private BookRepository bookRepo;

    @Override
    public ArrayList<BookEntity> listAllBook() {
        return (ArrayList<BookEntity>) bookRepo.findAll();
    }

    @Override
    public void insertBook(BookEntity entity) {
        bookRepo.save(entity);
    }

    @Override
    public void updateBook(BookEntity entity) {
        bookRepo.save(entity); // JPA는 save가 수정 역할도 겸합니다.
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
        boolean exists = bookRepo.existsById(bookNo);
        return exists ? "used" : "available";
    }
}	