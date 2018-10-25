package edu.smu.java.day2;

public class TestWhile2 {

	public static void main(String[] args) {

		// 1부터 10까지의 합을 계산하세요 : while문을 사용해서....
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
