package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.Optional;
import com.spring_boot_jpa_book.projectEx.entity.BookEntity;

public interface IBookServiceDataHandle {
    ArrayList<BookEntity> listAllBook();
    void insertBook(BookEntity entity);
    void updateBook(BookEntity entity);
    void deleteBook(String bookNo);
    Optional<BookEntity> detailViewBook(String bookNo);
    String bookNoCheck(String bookNo);
}