package com.dgrm.test.service;

import java.util.List;

import com.dgrm.test.vo.MyVO;

public interface IMyService {
	List<MyVO> getData() throws Exception;
    List<MyVO> insertData() throws Exception;
}
