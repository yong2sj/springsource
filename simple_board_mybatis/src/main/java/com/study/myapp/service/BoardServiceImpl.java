package com.study.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.myapp.dao.BoardDAO;
import com.study.myapp.dto.BoardDTO;
import com.study.myapp.mapper.BoardMapper;

@Service("service")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public List<BoardDTO> getList() {
		return mapper.select();
	}

	@Override
	public BoardDTO getRow(int bno) {
		return mapper.selectOne(bno);
	}

	@Override
	public boolean boardInsert(BoardDTO insertDto) {
		return mapper.insert(insertDto)==1?true:false;
	}

	@Override
	public boolean boardUpdate(BoardDTO updateDto) {
	
		return mapper.update(updateDto)==1?true:false;
	}

	@Override
	public boolean boardDelete(int bno) {
		return mapper.delete(bno)==1?true:false;
	}

}
