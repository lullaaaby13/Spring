package com.spring.apple.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("getText")
	public @ResponseBody String getText(@RequestParam("textForm") String text, HttpServletResponse response) throws IOException{
		
		logger.info(text);
		logger.info(text);
		return text;
	}
	
	
	@RequestMapping("getImage")
	public void getImage(HttpServletResponse response) throws IOException{
		File file = new File("C:\\Users\\THELEAP\\git\\Spring\\sampleConfig\\src\\main\\webapp\\resources\\assets\\img\\NAS.jpg");
		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is);
		
		byte[] bytes = new byte[bis.available()];
		System.out.println("size : " + bytes.length);
		
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		IOUtils.copy(is, response.getOutputStream());
		
	}
	
	
	
}
