package com.dgrm.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dgrm.test.service.MyServiceImp;
import com.dgrm.test.vo.MyVO;

@Repository
@RestController
public class MyController {
		
	@Autowired
	private MyServiceImp service;
	
	@RequestMapping(value="/") 
	public String test() throws Exception {
		
		System.out.println("테스트중입니다. ");
//		List<MyVO> data = service.getData();
		return "데이터가 전송되었음";
	}

	@CrossOrigin("*")
	@RequestMapping(value="/loginForm.do", method=RequestMethod.GET)
	public List<MyVO> pass() throws Exception {
		
		List<MyVO> vo = service.getData();
		return vo;
	}
	
	@CrossOrigin("*")
	@RequestMapping(value="/goInsertForm.do", method=RequestMethod.GET)
	public List<MyVO> insert() throws Exception {
		List<MyVO> vo = service.getData();
		return vo;
	}
	

}
