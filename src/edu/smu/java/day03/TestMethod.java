package edu.smu.java.day3;

public class TestMethod {

	public static void main(String[] args) {
		//a, b�� ���� �Է¹޾� �����ϴ� �Լ��� ������ ����...
		int a = 3;
		int b = 4;
		int r = add(a,b);
		System.out.println(r);
		printInfo("ȫ�浿", 344);
	}
	
	//���ϱ� ����� �����ϴ� �Լ�...
	//[����������, ���������] ����Ÿ�� �Լ��� (�Լ��� ���ڰ�){ ������   }
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static void printInfo(String name, int num) {
		System.out.println("========= ȯ���մϴ� "+name+" �� ==========");
		System.out.println("����� ������ �����ϴ� ��ȭ�� "+ num +" ȣ �Դϴ�");
	}
	

}






