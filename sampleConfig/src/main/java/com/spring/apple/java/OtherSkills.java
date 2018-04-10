package com.spring.apple.java;

import java.io.File;
import java.net.URI;

public class OtherSkills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		try {
			
			File f = new File("C:\\SpringResource", "outputTest.txt");
			f.createNewFile();
		
		}catch(Exception e) {
			System.out.println("Exception Occurs.");
		}
		
		
	}

}
