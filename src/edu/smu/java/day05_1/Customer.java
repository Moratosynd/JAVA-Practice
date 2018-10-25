package edu.sum.java.day5;

public class Customer {
	String name;
	String tel;
	int age;
	float weight;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", tel=" + tel + ", age=" + age + ", weight=" + weight + "]";
	}
	
}
