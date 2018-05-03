package com.spring.apple.util;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class PagingUtil {

	@Autowired
	private SqlSessionTemplate session;
	
	public void test(){
		session.selectList("com.spring.apple.methodFirst");
	}
	
	
	
	
	
}
