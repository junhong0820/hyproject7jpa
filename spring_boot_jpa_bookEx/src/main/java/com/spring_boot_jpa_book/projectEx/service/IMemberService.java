package com.spring_boot_jpa_book.projectEx.service;

import java.util.HashMap;

import com.spring_boot_jpa_book.projectEx.dto.MemberDTO;

public interface IMemberService {
	public String loginCheck(HashMap<String, Object> map);
	public String idCheck(String id);
	public void insertMember(MemberDTO dto);
}
