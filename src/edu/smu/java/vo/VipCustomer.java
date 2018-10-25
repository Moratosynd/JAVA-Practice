package edu.smu.java.vo;

public class VipCustomer extends Customer{
	private String hobby;

	public VipCustomer() {
		super();
	}

	public VipCustomer(String name, String tel, String hobby) {
		super(name, tel);
		this.hobby = hobby;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "VipCustomer [hobby=" + hobby + ", name=" + name + ", tel=" + tel + "]";
	}
}
