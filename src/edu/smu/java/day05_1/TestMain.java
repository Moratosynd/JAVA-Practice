package edu.sum.java.day5;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		b.name = "java";
		b.author = "���ӽ�";
		b.publisher = "��";
		b.price = 1000;
		System.out.println(b.name);
		
		Book b1 = new Book();
		b1.name = "C";
		b1.author = "��ġ";
		b1.publisher = "����";
		b1.price = 3000;
		System.out.println(b1.name);
		
		b.setName("���̽�");
		b.setAuthor("����");
		b.setPublisher("��������");
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
