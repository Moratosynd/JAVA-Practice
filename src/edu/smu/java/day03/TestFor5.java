package edu.smu.java.day3;

public class TestFor5 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수중 2 또는 3의 배수가 아닌 수의 총합을 구하세요... and -> &&, or -> ||
		// for문을 활용하여 코드를 구현해 보세요...

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
