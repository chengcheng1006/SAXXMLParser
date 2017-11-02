package ctech.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TagValueHandle extends DefaultHandler {
	
	private String currentTag;
	private int authorNumber = 2;
	private int currentAuthorNumber = 0;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		currentTag = qName;
		if("author".equals(qName)){
			currentAuthorNumber++;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		currentTag = "";
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		if("author".equals(currentTag) && currentAuthorNumber == authorNumber){
			System.out.println(new String(ch,start,length));
		}
	}
	
}
