import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class DefaultMainClass {

	public static void main(String[] args) throws Exception {
		
		/*FileExample exam = new FileExample();
		
		exam.fileWriter();
		exam.fileInputStream();*/
		
		//veLej75UjMtcM0oZnI1dqSgLHpAtK5LJR5xDIYp6W2OhpdWvytmnK%2Bt%2BYLMnlvN0v3mxKptmgSZP8UVhDD66kg%3D%3D
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/9710000/BillInfoService/getPetitionStatic"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=veLej75UjMtcM0oZnI1dqSgLHpAtK5LJR5xDIYp6W2OhpdWvytmnK%2Bt%2BYLMnlvN0v3mxKptmgSZP8UVhDD66kg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("start_age","UTF-8") + "=" + URLEncoder.encode("19", "UTF-8")); /*대수*/
        System.out.println("url : " + urlBuilder.toString());
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        
        /*
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "UTF-8"));
        }
        
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        
        conn.disconnect();
        
        System.out.println(sb.toString());*/
        
        ///////////////////////
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(conn.getInputStream());
        document.getDocumentElement().normalize();
        
        System.out.println("Root element : " + document.getDocumentElement().getNodeName());
        System.out.println();
        
        NodeList personlist = document.getElementsByTagName("item");
        
        for (int i = 0; i < personlist.getLength(); i++) {
        	 
			System.out.println("---------- personNode "+ i + "번째 ------------------");

			Node personNode = personlist.item(i);

			if (personNode.getNodeType() == Node.ELEMENT_NODE) {
				// person엘리먼트 
				Element personElmnt = (Element) personNode;

				// name 태그
				NodeList nameList= personElmnt.getElementsByTagName("choice");
				Element nameElmnt = (Element) nameList.item(0);
				Node name = nameElmnt.getFirstChild();
				System.out.println("choice    : " + name.getNodeValue());

				// tel 태그
				NodeList telList= personElmnt.getElementsByTagName("committee");
				Element telElmnt = (Element) telList.item(0);
				Node tel = telElmnt.getFirstChild();
				System.out.println("committee : " + tel.getNodeValue());

				
			}

			System.out.println("---------------------------------------------");
			System.out.println();
		}
        
	}

}
