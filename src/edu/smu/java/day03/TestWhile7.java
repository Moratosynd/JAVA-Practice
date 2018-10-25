package edu.smu.java.day3;

import java.util.Scanner;

public class TestWhile7 {

	public static void main(String[] args) {

		// Scanner로 양의 정수를 입력받는다... 데이터 타입은 int

		Scanner sc = new Scanner(System.in);
		System.out.println("각 자리의 수의 합을 구할 양의 수를 입력하세요..");
		int num = sc.nextInt();

		// 15467, 378904, 132
		// 각 자리수의 합...
		int sum = 0;
		// hint : %, / 연산자를 사용하면 됩니다...
		while (true) {
			// 132
			int na = num % 10;
			sum = sum + na;
			num = num / 10;
			if (num == 0) {
				break;
			}
		}
		System.out.println(" 각 자리수의 합은 : " + sum);

	}

}




