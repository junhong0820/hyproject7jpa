package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;


public interface IBookService {

	ArrayList<BookDTO> listAllBook();
    void insertBook(BookDTO dto);
    void updateBook(BookDTO dto);
    void deleteBook(String bookNo);
    BookDTO detailViewBook(String bookNo);
    String bookNoCheck(String bookNo);
    ArrayList<BookDTO> bookSearch(HashMap<String, Object> map);
    
}
