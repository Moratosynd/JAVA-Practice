package edu.smu.java.day3;

public class TestFor5 {

	public static void main(String[] args) {
		// 1���� 20������ ������ 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϼ���... and -> &&, or -> ||
		// for���� Ȱ���Ͽ� �ڵ带 ������ ������...

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			/*
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			sum = sum + i;
			*/
			
			if (i % 2 != 0  &&  i % 3 != 0) {
				sum += i;
			}
			
		}
		System.out.println("sum : "+sum);
		
	}

}
