package edu.smu.java.day3;

public class TestFor6 {

	public static void main(String[] args) {

		// 두개의 주사위를 던져서 합이 6이 나오는 경우의 모두 수를 출력하세요...
		// 1, 5 / 2, 4 / 3, 3 / 4, 2 / 5,1
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println("주사위 합이 6이 되는 경우 : "
							+ "1번 주사위 " + i + ", 2번 주사위 : " + j);
				}
			}
		}

	}

}
