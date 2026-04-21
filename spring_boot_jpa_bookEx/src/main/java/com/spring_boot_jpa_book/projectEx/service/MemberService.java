package com.spring_boot_jpa_book.projectEx.service;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring_boot_jpa_book.projectEx.dto.MemberDTO;
import com.spring_boot_jpa_book.projectEx.entity.MemberEntity;
import com.spring_boot_jpa_book.projectEx.repository.MemberRepository;

@Service
public class MemberService implements IMemberService {

    @Autowired
    private MemberRepository memberRepo;

    @Autowired
    private PasswordEncoder pwdEncoder;

    // 로그인 체크
    @Override
    public String loginCheck(HashMap<String, Object> map) {
        String id = (String) map.get("id");
        String inputPwd = (String) map.get("pwd");

        // 1. Repository로 회원 정보 조회
        MemberEntity entity = memberRepo.findById(id).orElse(null);

        if (entity != null) {
            // 2. 암호화된 비밀번호 대조
            if (pwdEncoder.matches(inputPwd, entity.getMemPwd())) {
                return "success";
            }
        }
        return "fail";
    }

    // 회원 가입
    @Override
    public void insertMember(MemberDTO dto) {
        // 비밀번호 암호화
        String encodedPwd = pwdEncoder.encode(dto.getMemPwd());
        
        // DTO -> Entity 변환 (Builder 활용)
        MemberEntity entity = MemberEntity.builder()
                .memId(dto.getMemId())
                .memPwd(encodedPwd)
                .memName(dto.getMemName())
                .memEmail(dto.getMemEmail())
                .memHp(dto.getMemHp())
                .memZipcode(dto.getMemZipcode())
                .memAddress1(dto.getMemAddress1())
                .memAddress2(dto.getMemAddress2())
                .memJoinDate(new Date()) // 가입일은 현재 시간으로
                .build();

        memberRepo.save(entity);
    }

    @Override
    public String idCheck(String id) {
        // Repository에 만든 searchById 혹은 idCheck 메서드를 호출합니다.
        String resultId = memberRepo.idCheck(id); 
        
        // 결과가 null이 아니면 이미 아이디가 존재한다는 뜻!
        if (resultId != null) {
            return "used";
        } else {
            return "available";
        }
    }
}