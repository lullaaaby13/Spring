package example.stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class StreamExample {

	private static final Logger logger = Logger.getLogger("StreamExample");
	
	/**
	 * 1. InputStream -> 추상클래스
	 * 
	 * 1-1. FileInputStream 
	 * 
	 * 1-2. FilterInputStream
	 * 	1-2-1.BufferedInputStream
	 * 	1-2-2.DataInputStream
	 */
	
	
	public static void main(String[] args) throws Exception{
		logger.info("Start.");
		
		
		//1
		//readFileByFileInputStream("input.txt");
		
		//2
		//readFileByBufferedInputStream("input.txt", "Builder");
		
		//3
		inputStreamReader("input.txt");
		
		
	}
	
	/* FileInputStream */
	public static void readFileByFileInputStream(String fileName) {
		logger.info("FileInputStream Start.");
		File file = new File("input.txt");
		
		FileInputStream is = null;
		try {
			is = new FileInputStream(file);
			
			int ch;
			
			while((ch = is.read()) != -1) {
				System.out.print((char)ch);
			}
			
			is.close();
			
		}catch(FileNotFoundException e) {
			logger.info("FileNotFoundException Occuers.");
		}catch(IOException e) {
			logger.info("IOException Occuers.");
		}finally{
			
		}
	}
	
	/* BufferedInputStream */
	public static void readFileByBufferedInputStream(String fileName, String method) {
		/*
		 * method -> 	1.Basic 	: 일반적인 출력
		 * 				2.Builder 	: StringBuilder를 이용한 출력
		 * 				3.이외		: Pass
		 */
		logger.info("BufferedInputStream Start.");
		
		File file = new File("input.txt");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		StringBuilder sb = new StringBuilder();
         
         
		try {
			// FileInputStream 으로 "input.txt" 파일의 객체를 생성 후
            // BufferedInputStream 객체를 생성한다.
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			
			/*
			 * 일반적인 출력 방법.
			 */
			if(method.equals("Basic")) {
				int ch;
				
				while((ch = bis.read()) != -1) {
					
					System.out.print((char)ch);
				}
			}else if(method.equals("Builder")) {
			/*
			 * 	StringBuilder 클래스 사용
			 */
				while(bis.available() > 0) {
					sb.append((char)bis.read());
				}
				System.out.println("Read this : ");
				System.out.println(sb.toString());
			}
			
			fis.close();
			bis.close();
			
		}catch(FileNotFoundException e) {
			logger.info("FileNotFoundException Occuers.");
		}catch(IOException e) {
			logger.info("IOException Occuers.");
		}
		
		
	}
	
	public static void inputStreamReader(String fileName) {
		File file = new File(fileName);
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			is = new FileInputStream(file);
			isr = new InputStreamReader((InputStream)is, "EUC-KR");
			br = new BufferedReader(isr);
			
			String line;
			
			while((line = br.readLine()) != null)
				System.out.println(line);
			
		}catch(Exception e) {}
		
	}
	
	
	
}
