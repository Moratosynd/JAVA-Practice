package edu.java.smu.trans;

import edu.java.smu.lang.IFly;

public class Airplane extends Trans implements IFly {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 출발합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 정지합니다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행기가 날아다닙니다.");
	}

}
