package com.spring.apple.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.apple.model.APIVO;

@Repository
public class APIDao {

	@Autowired
	private SqlSessionTemplate session;
	
	public List<APIVO> methodFirst(APIVO vo){
		List<APIVO> first = (List)session.selectList("com.spring.apple.methodFirst", vo);
		List<APIVO> second = (List)session.selectList("com.spring.apple.methodSecond", vo);
		System.out.println(first.get(0).getFirst() + " :: " + second.get(0).getSecond());
		return (List)session.selectList("com.spring.apple.methodFirst", vo);
	}
	
}
