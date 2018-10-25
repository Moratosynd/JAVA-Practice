package edu.sum.java.day5;

public class Product {
	// 상품코드
	String pcode;
	// 상품이름
	String name;
	// 상품가격
	int price;
	// 상품수량
	int quant;
	
	Product(){
		this("pcode","name",1000,1);
		System.out.println("Product 생성자");
	}
	
	Product(String _pcode, String _name, int _price, int _quant){
		
		System.out.println("Product(String _pcode, String _name, int _price, int _quant) 생성자");
		pcode = _pcode;
		name = _name;
		price = _price;
		quant = _quant;
	}
	
	
	public String getPcode() {
		
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", name=" + name + ", price=" + price + ", quant=" + quant + "]";
	}
	
	
	
}
