package edu.smu.java.vo;

public class Daughter extends Father{

	@Override
	public int makemoney(int time) {
		// TODO Auto-generated method stub
		return super.makemoney(time) + 1000;
	}
	// Ȯ��
	public String makeup(int time) {
		return time + " �ð� ȭ���߾��";
	}
	
}
