package com.spring.apple.common;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NavigatorController {

	
	private static final Logger logger = LoggerFactory.getLogger(NavigatorController.class);
	
	@RequestMapping("/**/*.do")
	public String navigator(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getServletPath();
		String viewName = FilenameUtils.removeExtension(path);
		
		logger.info("Request URL : " + path);
		logger.info("Return View Name : " + viewName);
		
		return viewName;
	}
	
	@RequestMapping("/**/*.jpg")
	public void image(HttpServletRequest request, HttpServletResponse response) throws IOException{
		logger.info("image File Requested.");
		String contextPath = "C:\\Users\\THELEAP\\git\\Spring\\sampleConfig\\src\\main\\webapp";
		String imageFolder = "\\resources\\assets\\img\\";
		String fileName = "NAS.jpg";
		
		File file = new File(contextPath + imageFolder + fileName);
		InputStream is = new FileInputStream(file);
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		IOUtils.copy(is, response.getOutputStream());
	}
	
}
