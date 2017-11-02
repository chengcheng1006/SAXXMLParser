package ctech.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BeanToListHandler extends DefaultHandler {
	public List<Book> getList() {
		return list;
	}

	private List<Book> list = new ArrayList<>();
	private String currentTag;
	private Book book;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		currentTag = qName;
		if("book".equals(currentTag)){
			book = new Book();
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content = new String(ch,start,length);
		if("bookname".equals(currentTag)){
			book.setName(content);
		}
		if("author".equals(currentTag)){
			book.setAuthor(content);
		}
		if("price".equals(currentTag)){
			book.setPrice(content);
		}
		if("ISBN-13".equals(currentTag)){
			book.setISBN_13(content);
		}
		if("ISBN-10".equals(currentTag)){
			book.setISBN_10(content);
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		currentTag = null;
		if("book".equals(qName)){
			list.add(book);
			book=null;
		}
	}

	

}
