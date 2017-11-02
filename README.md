# SAXXMLParser
SAX, XML , Parser

### SAX

SAX provides a mechanism for reading data from an XML document that is an alternative to that provided by the Document Object Model (DOM).

### Compare Difference between JAXP DOM and SAX

1. SAX based on Events, Events are triggered when the XML is being parsed. So basically SAX API read XML file line by line. On the contrary, JAXP DOM read whole file before parse and then pack it as an object(Document).

2. We can not use SAX parser to carry operations like create a new Element, update Contents(Attributes) and delete an Element from your XML file.

3. JAXP DOM read whole XML file into RAM before analysis it.The entire XML is parsed and a DOM tree (of the nodes in the XML) is generated and returned. Once parsed, the user can navigate the tree to access the various data previously embedded in the various nodes in the XML.


