package edu.smu.java.day2;

public class TestWhile {

	public static void main(String[] args) {

		// int num = 1;
		// while(num <=10) {
		// System.out.println("num : "+num);
		// num = num + 1;
		// }

		// while �� �̿��Ͽ� 1���� 20���� �����߿��� 3�� ����� ���� ����ϼ���...
		int num = 1;
		int sum = 0;
		while (num <= 20) {
			if (num % 3 == 0) {
				sum = sum + num;
			}
			num++;
		}
		System.out.println(sum);
	}

}
