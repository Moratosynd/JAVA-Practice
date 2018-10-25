package edu.smu.java.vo;

public class FriendContact extends Contact {
	
	private String birth;
	
	public FriendContact() {
	
	}

	public FriendContact(String name, String addr, int age, String birth) {
		super(name, addr, age);
		this.birth = birth;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "FriendContact [birth=" + birth + ", name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	
}
