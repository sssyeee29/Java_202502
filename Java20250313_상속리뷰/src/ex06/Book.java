package ex06;

public class Book {

	private String title;
	private String author;
	private int price;
	
	Book() {
		this("자바의정석", "남궁성", 35000);
//		title = "자바의정석";
//		author = "남궁성";
//		price = 35000;
	}
	
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return "title:" + title +", author:" + author + ", price:" + price;
	}
}
