package edu.sum.java.day4;

public class summary04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result= time(5);
		if(result == true) {
			System.out.println("�������ƿ� �׶� �����ſ���");
		}else {
			System.out.println("�̳� �ȵ�");
		}
	}

	static boolean time (int t){
		if(t <= 5) {
			return false;
		}
		
		System.out.println("������ "+t+"�ÿ� ������ �󸶳� ������");
		
		return true;
	}
}


