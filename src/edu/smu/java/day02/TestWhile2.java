package edu.smu.java.day2;

public class TestWhile2 {

	public static void main(String[] args) {

		// 1���� 10������ ���� ����ϼ��� : while���� ����ؼ�....
		int num = 1;
		int sum = 0;
		while (true) {

			sum = sum + num;
			num++;

			if (num == 11) {
				break;
			}

		}
		System.out.println("sum :"+sum);
	}

}
