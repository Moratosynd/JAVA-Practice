package edu.smu.java.day3;

import java.util.Scanner;

public class TestWhile7 {

	public static void main(String[] args) {

		// Scanner�� ���� ������ �Է¹޴´�... ������ Ÿ���� int

		Scanner sc = new Scanner(System.in);
		System.out.println("�� �ڸ��� ���� ���� ���� ���� ���� �Է��ϼ���..");
		int num = sc.nextInt();

		// 15467, 378904, 132
		// �� �ڸ����� ��...
		int sum = 0;
		// hint : %, / �����ڸ� ����ϸ� �˴ϴ�...
		while (true) {
			// 132
			int na = num % 10;
			sum = sum + na;
			num = num / 10;
			if (num == 0) {
				break;
			}
		}
		System.out.println(" �� �ڸ����� ���� : " + sum);

	}

}




