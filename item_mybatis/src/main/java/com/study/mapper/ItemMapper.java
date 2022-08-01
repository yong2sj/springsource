package com.study.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.study.dto.ItemDTO;

public interface ItemMapper {
	public int insert(ItemDTO insertDto);
	public ItemDTO selectOne(int num);
	public int delete(int num);
	//public int update(ItemDTO updateDto);
	public int update(@Param("num")int num, @Param("psize")String psize, @Param("price")int price);
	public List<ItemDTO> select(); 
	// 메소드명이 중요함 -> mapper.xml id로 들어갈거임
}
