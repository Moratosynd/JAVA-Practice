package edu.smu.java.day2;

public class TestFor2 {

	public static void main(String[] args) {

		// 구구단중 3단을 줄력해 보자....
		// 3 * 1 = 3
		// 3 * 2 = 6 ~~~
		// 3 * 9 = 27
		// 위와 같이 출력이 되도록 for문을 구현해 보자....
		// int dan = 3;
		// for(int i=1;i<=9;i++) {
		// System.out.println(dan + " * " + i +" = "+(dan * i) );
		// }

		// 2단 ~ 9단까지 출력을 하세요..
		// ======== 2단 ==========
		// 2 * 1 = 2 ~~~~
		// ======== 3단 ==========
		// 3 * 1 = 3

		// 단
		for (int dan = 2; dan <= 9; dan++) {
			// 단에 해당하는 1~9 까지의 구구단에 활용....
			System.out.println("====== " + dan + " 단 ======");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}

		}

	}

}
