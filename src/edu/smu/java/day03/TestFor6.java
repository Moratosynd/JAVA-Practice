package edu.smu.java.day3;

public class TestFor6 {

	public static void main(String[] args) {

		// �ΰ��� �ֻ����� ������ ���� 6�� ������ ����� ��� ���� ����ϼ���...
		// 1, 5 / 2, 4 / 3, 3 / 4, 2 / 5,1
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println("�ֻ��� ���� 6�� �Ǵ� ��� : "
							+ "1�� �ֻ��� " + i + ", 2�� �ֻ��� : " + j);
				}
			}
		}

	}

}
