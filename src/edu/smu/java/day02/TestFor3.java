package edu.smu.java.day2;

public class TestFor3 {

	public static void main(String[] args) {
		
		//For ���� : 1~30������ �����߿��� 3�� ����� �հ� 3�� ����� ������ ����ϼ���
		
		//1���� 30������ 3�� ����� ���� ~~ �̰� ������ ~~ �� �Դϴ�...
		int sum = 0;
		int count = 0;
		for(int i = 1;i<=30;i++) {
			//3,6,9 ~~~30
			if(i%3 ==0) {
				sum = sum + i;
				count = count + 1;
			}			
		}
		System.out.println("3�� ����� ���� :"+sum+", ������ :"+count);
		
		
		
		
		
		

	}

}





