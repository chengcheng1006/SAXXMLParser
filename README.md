# SAXXMLParser
SAX, XML , Parser

### SAX

SAX provides a mechanism for reading data from an XML document that is an alternative to that provided by the Document Object Model (DOM).

### Compare Difference between JAXP DOM and SAX

1. SAX based on Events, Events are triggered when the XML is being parsed. So basically SAX API read XML file line by line. On the contrary, JAXP DOM read whole file before parse and then pack it as a Tree structure.

2. We can not use SAX parser to carry operations like create a new Element, update Contents(Attributes) and delete an Element from your XML file.

3. JAXP DOM read whole XML file into RAM before analysis it. The entire XML is parsed and a DOM tree (of the nodes in the XML) is generated and returned. Once parsed, the user can navigate the tree to access the various data previously embedded in the various nodes in the XML.


### How to use SAX parser parse a XML file

```
    //Generate a SAX XML reader.
    SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		XMLReader reader = parser.getXMLReader();
		
    //Generate a handler implement ContentHandler (or extends DefaultContentHandler).
		BeanToListHandler handler = new BeanToListHandler();
    
    //Bound handler to reader.
		reader.setContentHandler(handler);
		
    //parse XML file.
		reader.parse("XMLFile/config.xml");
```

override method in ContentHandler
```
//When parser met a start tag this event will be triggered.
public void startElement(String uri, String localName, String qName, Attributes attributes)
```

```
//When parser met a Content this event will be triggered.
public void characters(char[] ch, int start, int length)
```

```
//When parser met a end tag this event will be triggered.
public void endElement(String uri, String localName, String qName)
```

### We use SAX to parse a XML file

XML file Example:
```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<bookshelf>
<book>
	<bookname name="thinking in java">Thinking in Java</bookname>
	<author>Bruce Eckel</author>
	<price>$74.99</price>
	<ISBN-13>978-0131872486</ISBN-13>
	<ISBN-10>0131872486</ISBN-10>
</book>
<book>
	<bookname name="head-first java">Head-First Java</bookname>
	<author>Bert Bates and Kathy Sierra</author>
	<price>$44.95</price>
	<ISBN-13>978-0596009205</ISBN-13>
	<ISBN-10>0596009208</ISBN-10>
</book>
<book>
	<bookname name="effective java">Effective Java</bookname>
	<author>Joshua Bloch</author>
	<price>$54.99</price>
	<ISBN-13>978-0134685991</ISBN-13>
	<ISBN-10>0134685997</ISBN-10>
</book>
</bookshelf>
```

SAX ContentHandler::

[BeanToListHandler](https://github.com/chengcheng1006/SAXXMLParser/blob/master/Sax/src/ctech/sax/BeanToListHandler.java)
