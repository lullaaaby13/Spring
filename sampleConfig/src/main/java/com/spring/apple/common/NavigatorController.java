package com.spring.apple.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NavigatorController {

	
	private static final Logger logger = LoggerFactory.getLogger(NavigatorController.class);
	
	@RequestMapping("/**/*.do")
	public String navigator(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getServletPath();
		String viewName = FilenameUtils.removeExtension(path);
		
		logger.info(path);
		logger.info(viewName);
		
		return viewName;
	}
}
