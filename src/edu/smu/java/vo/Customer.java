package edu.smu.java.vo;

public class Customer extends Object{
	protected String name;
	protected String tel;
	public Customer(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public Customer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	
}
