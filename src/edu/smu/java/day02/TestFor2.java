package edu.smu.java.day2;

public class TestFor2 {

	public static void main(String[] args) {

		// �������� 3���� �ٷ��� ����....
		// 3 * 1 = 3
		// 3 * 2 = 6 ~~~
		// 3 * 9 = 27
		// ���� ���� ����� �ǵ��� for���� ������ ����....
		// int dan = 3;
		// for(int i=1;i<=9;i++) {
		// System.out.println(dan + " * " + i +" = "+(dan * i) );
		// }

		// 2�� ~ 9�ܱ��� ����� �ϼ���..
		// ======== 2�� ==========
		// 2 * 1 = 2 ~~~~
		// ======== 3�� ==========
		// 3 * 1 = 3

		// ��
		for (int dan = 2; dan <= 9; dan++) {
			// �ܿ� �ش��ϴ� 1~9 ������ �����ܿ� Ȱ��....
			System.out.println("====== " + dan + " �� ======");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}

		}

	}

}
