package basic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Read_XML_File {

	public static <var> void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		// TODO Auto-generated method stub

		
	File file = new File("J:\\Selenium_Project\\Note1.xml");
		 
		  BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  
		  String value="";
		  while ((st = br.readLine()) != null)
		  {   System.out.println(st);
		  
		 
		  
		

		  Pattern pattern = Pattern.compile("<to>(.*?)</to>");
		  String[] result = pattern.split(st);
		  System.out.println("Values in between tags are "+Arrays.toString(result));
		
		   value=value+st;
		  
		  }
		  
		System.out.println("The value is "+value);
		  
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder builder = factory.newDocumentBuilder();
		  Document document = builder.parse(new InputSource(new StringReader(value)));
		  Element rootElement = document.getDocumentElement();
		
	// = rootElement.getElementsByTagName("requestqueue")[0];
		  
		  
		 
		
}
}

