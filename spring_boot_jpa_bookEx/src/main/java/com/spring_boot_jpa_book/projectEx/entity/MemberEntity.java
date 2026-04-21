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
@Table(name="member") // 실제 DB 테이블명
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder // 5번 항목: Builder 패턴 적용
public class MemberEntity {

    @Id
    private String memId;
    
    private String memPwd;
    private String memName;
    private String memEmail;
    private Date memJoinDate;
    private String memHp;
    private String memZipcode;
    private String memAddress1;
    private String memAddress2;
}