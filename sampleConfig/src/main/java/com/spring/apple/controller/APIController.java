package com.spring.apple.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apple.model.APIVO;
import com.spring.apple.service.APIService;

@RestController
public class APIController {

	private static final Logger logger = LoggerFactory.getLogger(APIController.class);
	
	@Autowired
	private APIService apiService = null;
	
	
	@RequestMapping("/example/test")
	public @ResponseBody Map<String, Object> methodFirst(APIVO vo, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> map = new HashMap();
		
		logger.info("methodFirst : Start");
		
		List<APIVO> result = apiService.methodFirst(vo);
		
		
		map.put("result", result);
		
		return map;
	}
	
}
