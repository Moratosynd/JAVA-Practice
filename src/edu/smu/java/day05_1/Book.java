package edu.sum.java.day5;

// class  정의
/* class 이름{
 	속성
 	타입 변수;
 	
 }
*/
public class Book {
	
	String name;
	String publisher;
	String author;
	int price;
	
	public String getPublisher() {
		
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String _author) {
		author = _author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int _price) {
		price = _price;
	}

	
	
	void setName(String _name){
		name = _name;
	}
	
	String getName(){
		return name;
	}
	
	public String toString() {
		String str = name + ", "+author+", "+ publisher+", "+price;
		return str;
	}
	
}
