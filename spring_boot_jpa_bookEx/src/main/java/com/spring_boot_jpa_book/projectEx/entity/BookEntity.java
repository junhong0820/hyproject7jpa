package com.spring_boot_jpa_book.projectEx.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="book") // DB 테이블 이름
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // 5-1번 항목: Builder 생성 완료!
public class BookEntity {

    @Id // 기본키(PK)
    private String bookNo;

    private String bookName;
    private String bookAuthor;
    private int bookPrice;
    private Date bookDate;
    private int bookStock;
    private String pubNo;
}