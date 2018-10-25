package edu.smu.java.day1;

import java.util.Scanner;

public class TestIf2 {

	public static void main(String[] args) {

		// 특정한 정수값을 입력받아 짝수 홀수를 출력하는 프로그램을 구현하세요...
		// 출력 형테 : 4는 짝수입니다.~~

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요...");
		int inputValue = sc.nextInt();

		if (inputValue % 2 == 0) {
			System.out.println(inputValue + " 짝수입니다...");
		} else {
			System.out.println(inputValue + " 홀수입니다...");
		}
	}
	
}
