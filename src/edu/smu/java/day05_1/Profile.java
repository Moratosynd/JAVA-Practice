package edu.sum.java.day5;

public class Profile {
	String name;
	int age;
	String addr;
	char gender;
	
	public void setName(String _name) {
		name = _name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int _age) {
		age = _age;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String _addr) {
		addr = _addr;
	}
	public void setGender(char _gender) {
		gender = _gender;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", age=" + age + ", addr=" + addr + ", gender=" + gender + "]";
	}
	
}
