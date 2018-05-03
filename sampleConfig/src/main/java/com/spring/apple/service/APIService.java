package com.spring.apple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apple.dao.APIDao;
import com.spring.apple.model.APIVO;

@Service
public class APIService {

	@Autowired
	private APIDao apiDao;
	
	public List<APIVO> methodFirst(APIVO vo){
		return apiDao.methodFirst(vo);
	}
}
