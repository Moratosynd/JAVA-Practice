package edu.java.smu.aven;

import edu.java.smu.lang.IFly;

public class Bird extends Animal implements IFly{
	
	public void move() {
		System.out.println("���� �����Դϴ�.");
	};
	
	public void fly() {
		System.out.println("���� ���ƴٴմϴ�.");
	}
}
