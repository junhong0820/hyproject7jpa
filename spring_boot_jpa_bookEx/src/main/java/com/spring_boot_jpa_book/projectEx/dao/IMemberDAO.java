package com.spring_boot_jpa_book.projectEx.dao;

import com.spring_boot_jpa_book.projectEx.dto.MemberDTO;

public interface IMemberDAO {

	//public String loginCheck(HashMap<String, Object> map);
	public String loginCheck(String id); //id로 검색 후 pwd 반환
	public String idCheck(String id);
	public void insertMember(MemberDTO dto);
}
