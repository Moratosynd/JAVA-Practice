package edu.java.smu.aven;

public class Human extends Animal{
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람이 움직입니다.");
	}
	
	public void speak() {
		System.out.println("사람이 말을 합니다.");
	}
}
