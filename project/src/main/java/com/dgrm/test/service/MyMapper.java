package com.dgrm.test.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dgrm.test.vo.MyVO;

@Mapper
public interface MyMapper {
	public List<MyVO> getData();
	public List<MyVO> insertData();
}
