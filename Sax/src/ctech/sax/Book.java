package ctech.sax;

public class Book {
	@Override
	public String toString() {
		return "BookName:"+name+"\n"
				+"Author:"+author+"\n"
				+"Price:"+price+"\n"
				+"ISBN-13:"+ISBN_13+"\n"
				+"ISBN-10:"+ISBN_10+"\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getISBN_13() {
		return ISBN_13;
	}
	public void setISBN_13(String iSBN_13) {
		ISBN_13 = iSBN_13;
	}
	public String getISBN_10() {
		return ISBN_10;
	}
	public void setISBN_10(String iSBN_10) {
		ISBN_10 = iSBN_10;
	}
	private String name;
	private String author;
	private String price;
	private String ISBN_13;
	private String ISBN_10;
}
