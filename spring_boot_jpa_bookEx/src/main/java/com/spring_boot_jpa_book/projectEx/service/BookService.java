package com.spring_boot_jpa_book.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_jpa_book.projectEx.dto.BookDTO;
import com.spring_boot_jpa_book.projectEx.entity.BookEntity;
import com.spring_boot_jpa_book.projectEx.repository.BookRepository;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepository bookRepo; // DAO 대신 Repository 주입

    // [전체 조회] Entity 리스트를 가져와서 DTO 리스트로 변환
    @Override
    public ArrayList<BookDTO> listAllBook() {
        List<BookEntity> entityList = bookRepo.findAll();
        ArrayList<BookDTO> dtoList = new ArrayList<>();
        
        for(BookEntity entity : entityList) {
            dtoList.add(convertToDTO(entity));
        }
        return dtoList;
    }

    // [등록 및 수정] DTO를 Entity로 변환해서 save
    @Override
    public void insertBook(BookDTO dto) {
        BookEntity entity = convertToEntity(dto);
        bookRepo.save(entity);
    }

    @Override
    public void updateBook(BookDTO dto) {
        // JPA는 save() 메서드가 ID(PK)가 있으면 Update, 없으면 Insert를 알아서 판단합니다.
        bookRepo.save(convertToEntity(dto));
    }

    @Override
    public void deleteBook(String bookNo) {
        bookRepo.deleteById(bookNo);
    }

    @Override
    public BookDTO detailViewBook(String bookNo) {
        // 없으면 null 반환
        BookEntity entity = bookRepo.findById(bookNo).orElse(null);
        return (entity != null) ? convertToDTO(entity) : null;
    }

    // BookService.java 내부
    @Override
    public String bookNoCheck(String bookNo) {
        // Repository의 searchById 호출
        String result = bookRepo.searchById(bookNo);
        
        // 값이 존재하면 중복(used), 없으면 사용 가능(available)
        return (result != null) ? "used" : "available";
    }

    // [검색] JPA Query Method나 @Query를 써야 하지만, 일단 빈 리스트 반환 (추후 구현 가능)
    @Override
    public ArrayList<BookDTO> bookSearch(HashMap<String, Object> map) {
        return new ArrayList<>(); 
    }

    // --- 변환 메서드 (Helper Methods) ---
    
    // Entity -> DTO 변환
    private BookDTO convertToDTO(BookEntity entity) {
        BookDTO dto = new BookDTO();
        dto.setBookNo(entity.getBookNo());
        dto.setBookName(entity.getBookName());
        dto.setBookAuthor(entity.getBookAuthor());
        dto.setBookPrice(entity.getBookPrice());
        dto.setBookDate(entity.getBookDate());
        dto.setBookStock(entity.getBookStock());
        dto.setPubNo(entity.getPubNo());
        return dto;
    }

    // DTO -> Entity 변환 (교수님이 강조하신 Builder 활용!)
    private BookEntity convertToEntity(BookDTO dto) {
        return BookEntity.builder()
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