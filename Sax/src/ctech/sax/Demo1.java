package ctech.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class Demo1 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		
		XMLReader reader = parser.getXMLReader();
		
		reader.setContentHandler(new ListHandler());
		
		reader.parse("XMLFile/config.xml");
	}
}
