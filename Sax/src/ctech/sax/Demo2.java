package ctech.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		
		XMLReader reader = parser.getXMLReader();
		
		reader.setContentHandler(new TagValueHandle());
		
		reader.parse("XMLFile/config.xml");
	}
}
