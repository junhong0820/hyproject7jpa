package com.spring_boot_jpa_book.projectEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.spring_boot_jpa_book.projectEx.entity.MemberEntity;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    
    // 아이디 중복 체크용
    @Query("SELECT m.memId FROM MemberEntity m WHERE m.memId = :id")
    String idCheck(@Param("id") String id);
}