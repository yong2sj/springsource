package com.study.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.study.dto.PersonDTO;

public interface PersonMapper {
	
	// #{id} => ? 변경
	// insert into person(id,name) values(?,?);
	// @Insert("insert into person(id,name) values(#{id},#{name})")
	// 쿼리문이 길어지면 이렇게 쓰끼 힘드므로 xml 파일에 작성한다.
	// src/main/resources 밑에다가 mapper가 사용하고 있는 패키지명과 동일한 폴더 생성
	// mapper 안에 파일과 똑같은 파일 생성
	
	public int insert(@Param("id") String id, @Param("name") String name);
	public int update(@Param("id") String id, @Param("name") String name);
	public int delete(String id);
	public PersonDTO select(String id);
}
