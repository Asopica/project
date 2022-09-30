package com.dgrm.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgrm.test.vo.MyVO;

@Service
public class MyServiceImp implements IMyService  {

	@Autowired
	private MyMapper mapper;
	
	@Override
	public List<MyVO> getData() throws Exception{
		return mapper.getData();
	}
	
	@Override
	public List<MyVO> insertData() throws Exception{
		return mapper.insertData();
	}
	
}
