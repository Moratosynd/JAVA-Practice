package edu.smu.java.vo;

public class Contact {
	protected String name;
	protected String addr;
	protected int age;
	
	public Contact() {
	}
	
	public Contact(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
}
