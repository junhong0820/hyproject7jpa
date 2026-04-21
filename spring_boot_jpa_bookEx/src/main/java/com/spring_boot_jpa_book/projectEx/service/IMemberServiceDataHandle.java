package com.spring_boot_jpa_book.projectEx.service;

import java.util.Optional;
import com.spring_boot_jpa_book.projectEx.entity.MemberEntity;

public interface IMemberServiceDataHandle {
    void insertMember(MemberEntity entity);
    Optional<MemberEntity> findMemberById(String memId);
    String idCheck(String memId);
}