package example.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLExample {

	
	public static void main(String[] args) throws Exception{
		System.out.println("is this real story?");
		
		File file = new File("getPetitionStatic.xml");
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);
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
	
	
	public static InputStream getInputStreamFromXMLFile(String fileName) throws FileNotFoundException {
		
		/*File file = new File(fileName);
		InputStream is = new InputStream(file);
		
		System.out.println("fil : " + file);
		System.out.println("inputstream : " + is);
		
		int ch;
		try {
			is.read(bytes);
			System.out.println(bytes);
		}catch(Exception e) {
			
		}
		*/
		
		return null;
	}
	
	
	
}
