package edu.smu.java.day2;

public class TestWhile {

	public static void main(String[] args) {

		// int num = 1;
		// while(num <=10) {
		// System.out.println("num : "+num);
		// num = num + 1;
		// }

		// while 문 이용하여 1부터 20까지 숫자중에서 3의 배수의 합을 출력하세요...
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
