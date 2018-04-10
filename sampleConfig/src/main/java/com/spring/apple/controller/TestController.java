package com.spring.apple.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
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
		
		return text;
	}
	
	@RequestMapping("tellme")
	public void tellme() throws IOException{
		
	
	}
	
}
