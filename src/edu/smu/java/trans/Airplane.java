package edu.java.smu.trans;

import edu.java.smu.lang.IFly;

public class Airplane extends Trans implements IFly {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("����Ⱑ ����մϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("����Ⱑ �����մϴ�.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("����Ⱑ ���ƴٴմϴ�.");
	}

}
