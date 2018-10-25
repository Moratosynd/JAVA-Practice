package edu.sum.java.day5;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		b.name = "java";
		b.author = "Á¦ÀÓ½º";
		b.publisher = "½ã";
		b.price = 1000;
		System.out.println(b.name);
		
		Book b1 = new Book();
		b1.name = "C";
		b1.author = "¸®Ä¡";
		b1.publisher = "¼±¹®";
		b1.price = 3000;
		System.out.println(b1.name);
		
		b.setName("ÆÄÀÌ½ã");
		b.setAuthor("¸ô¶ó");
		b.setPublisher("Á¤¸»¸ô¶ó");
		b.setPrice(30000);
		String name = b.getName();
		String author = b.getAuthor();
		int price = b.getPrice();
		String publisher = b.getPublisher();
		System.out.println(name);
		System.out.println(author);
		System.out.println(price);
		System.out.println(publisher);
		
		String info = b.toString();
		System.out.println(info);
		
	}

}
