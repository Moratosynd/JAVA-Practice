package edu.smu.java.vo;
	
public class Son extends Father{
	public int value = 30;
	// �Ϲݻ��
//	public String cleanning(int time) {
//		return time+" �ð� û���߾��";
//	}
	// ������(����� �������)
	public int makemoney(int time) {
		return time * value;
	}
	// Ȯ��
	public String enjoy(int time) {
		return time+" �ð� ��Ҿ��";
	}
}
