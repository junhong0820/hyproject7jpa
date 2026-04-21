package com.spring_boot_jpa_book.projectEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring_boot_jpa_book.projectEx.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {

    // 1. 기본 제공 메서드: save(), findAll(), findById(), deleteById() 등은 선언 안 해도 바로 사용 가능!

    // 2. (JPQL): 특정 컬럼(bookNo)만 조회하고 싶을 때
    @Query(value="SELECT b.bookNo FROM BookEntity b WHERE b.bookNo = :bookNo")
    String searchById(@Param("bookNo") String bookNo);
    
    // 3. JPA 쿼리 메서드 방식 (가장 권장): 
    // 메서드 이름만으로 "bookNo가 존재하는지"를 확인하는 쿼리를 자동 생성해줌
    boolean existsByBookNo(String bookNo);
}