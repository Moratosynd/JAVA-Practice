package edu.smu.java.day2;

public class TestFor {

	public static void main(String[] args) {
		// For ���� �ڵ�....
		// 1 ~ 10���� ���� ����ϴ� �ڵ带 �ۼ��� ����....
		//�ʱⰪ;���ǽ�;������
		//i++ -> i = i + 1;
		for(int i=1;i<11;i++) {
			//System.out.println(i);
		}
		
		//1~ 100������ ���� ���ؼ� ����� ��...
		//�ʱ�ġ, ���ǽ�, ������
		int sum = 0;
		//for(int a = 1; a <= 100 ; a=a+1 ) {
		//�ݺ��ؼ� ������ �ڵ�...	
//			sum = sum + 1;
//			sum = sum + 2;
//			sum = sum + 3;
//			sum = sum + 4;
		//}
		
		for(int a = 1; a<=100 ;a++) {
			sum = sum + a;
		}
		System.out.println("100���� �� : "+sum);
		
		
		

	}

}





