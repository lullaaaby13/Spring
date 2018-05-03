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
	 * 	������ ���̺귯�� (Jackson-databind) �� pom.xml�� �� �߰����־�� ����� �� ����.
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
		 * JSON Object ������ �߰�
		 * ���� ���̺귯���� �߰��ؾ� ��� ����.
		 * <dependency>
			    <groupId>com.googlecode.json-simple</groupId>
			    <artifactId>json-simple</artifactId>
			    <version>1.1.1</version>
			</dependency>
		 */
		
		//JSON Object ����
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("jsonFirst", "jsonFirst");
		jsonObj.put("jsonSecond", "jsonSecond");
		
		//JSON ������ ���ڿ��� ��ȯ(�����ϱ� ���ؼ�)
		String jsonStr = jsonObj.toString();
		
		//���ڿ��� ���� JSON�� JSON���·� ��ȯ
		//JSONParser parser = new JSONParser();
		
		map.put("jsonData", jsonStr);
		//JSON DATA
		logger.info(map.toString());
		
		return map;
	}
	
	
	
	
}
