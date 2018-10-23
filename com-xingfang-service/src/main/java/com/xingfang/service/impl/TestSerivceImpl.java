package com.xingfang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xingfang.bean.Student;
import com.xingfang.dao.StudentMapper;
import com.xingfang.service.TestService;

@Service
public class TestSerivceImpl implements TestService{

	@Autowired
	private StudentMapper studentMapper;
	
	public Student selectAll() {
		
		return studentMapper.selectAll();
	}
	
	
}
