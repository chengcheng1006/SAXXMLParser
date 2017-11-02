package ctech.sax;

import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class Demo3 {
	public static void main(String[] args) throws Exception, SAXException{
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		
		XMLReader reader = parser.getXMLReader();
		
		BeanToListHandler handler = new BeanToListHandler();
		reader.setContentHandler(handler);
		
		reader.parse("XMLFile/config.xml");
		
		List<Book> list = handler.getList();
		for(Book book:list){
			System.out.println(book.toString());
		}
	}
}
