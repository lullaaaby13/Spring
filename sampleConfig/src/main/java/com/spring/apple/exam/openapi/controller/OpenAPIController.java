package com.spring.apple.exam.openapi.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OpenAPIController {

	private static final Logger logger = LoggerFactory.getLogger(OpenAPIController.class);
	
	@RequestMapping("/example/Ajax/getPublicData")
	public @ResponseBody Map<String, Object> getPublicData() throws IOException{
		Map<String, Object> map = new HashMap();
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/9710000/BillInfoService/getBillInfoList"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=veLej75UjMtcM0oZnI1dqSgLHpAtK5LJR5xDIYp6W2OhpdWvytmnK%2Bt%2BYLMnlvN0v3mxKptmgSZP8UVhDD66kg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("controlno","UTF-8") + "=" + URLEncoder.encode("MONO1201027232", "UTF-8")); /**/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
		
		
		return map;
	}
	
	

	
}
