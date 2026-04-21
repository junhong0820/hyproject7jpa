package com.spring_boot_jpa_book.projectEx.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring_boot_jpa_book.projectEx.entity.MemberEntity;
import com.spring_boot_jpa_book.projectEx.repository.MemberRepository;

@Service
@Transactional
public class MemberServiceDataHandle implements IMemberServiceDataHandle {

    @Autowired
    private MemberRepository memberRepo;

    @Override
    public void insertMember(MemberEntity entity) {
        memberRepo.save(entity);
    }

    @Override
    public Optional<MemberEntity> findMemberById(String memId) {
        return memberRepo.findById(memId);
    }

    @Override
    public String idCheck(String memId) {
        // 이미 만들어둔 Repository의 idCheck 쿼리가 있다면 사용
        String resultId = memberRepo.idCheck(memId);
        return (resultId != null) ? "used" : "available";
    }
}