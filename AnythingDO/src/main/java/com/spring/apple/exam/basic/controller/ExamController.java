package com.spring.apple.exam.basic.controller;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {

	private static final Logger logger = LoggerFactory.getLogger(ExamController.class);
	
	
	
	/**
	 * 	다음의 라이브러리 (Jackson-databind) 를 pom.xml에 꼭 추가해주어야 사용할 수 있음.
	 * 
	 * <dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-databind</artifactId>
		    <version>2.5.0</version>
		</dependency>
	 * 
	 */
	@RequestMapping("/example/Ajax/getTestData")
	public @ResponseBody Map<String, Object> returnMap(){
		Map<String, Object> map = new HashMap();
		
		map.put("1st", "apple");
		map.put("2nd", "banana");
		map.put("3rd", "citron");
		map.put("4th", "durian");
		map.put("5th", "fruit");
	
		
		/*
		 * JSON Object 데이터 추가
		 * 다음 라이브러리를 추가해야 사용 가능.
		 * <dependency>
			    <groupId>com.googlecode.json-simple</groupId>
			    <artifactId>json-simple</artifactId>
			    <version>1.1.1</version>
			</dependency>
		 */
		
		//JSON Object 생성
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("jsonFirst", "jsonFirst");
		jsonObj.put("jsonSecond", "jsonSecond");
		
		//JSON 형식을 문자열로 변환(전송하기 위해서)
		String jsonStr = jsonObj.toString();
		
		//문자열로 받은 JSON을 JSON형태로 변환
		//JSONParser parser = new JSONParser();
		
		map.put("jsonData", jsonStr);
		//JSON DATA
		logger.info(map.toString());
		
		return map;
	}
	
	
	
	
}
