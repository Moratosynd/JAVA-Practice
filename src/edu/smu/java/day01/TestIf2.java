package edu.smu.java.day1;

import java.util.Scanner;

public class TestIf2 {

	public static void main(String[] args) {

		// Ư���� �������� �Է¹޾� ¦�� Ȧ���� ����ϴ� ���α׷��� �����ϼ���...
		// ��� ���� : 4�� ¦���Դϴ�.~~

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���...");
		int inputValue = sc.nextInt();

		if (inputValue % 2 == 0) {
			System.out.println(inputValue + " ¦���Դϴ�...");
		} else {
			System.out.println(inputValue + " Ȧ���Դϴ�...");
		}
	}
	
}
