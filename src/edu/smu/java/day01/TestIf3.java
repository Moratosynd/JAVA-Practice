package edu.smu.java.day1;

import java.util.Scanner;

public class TestIf3 {

	public static void main(String[] args) {

		//���� ���α׷��� �ۼ��� ����...
		//�Է��� Scanner�� �޴µ�   ������ ��1 ��2 : ��) + 4 2, - 4 2, x 4 2, / 4 2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========= ���� ���� ==========");
		System.out.println("����� : ������(+ - x /) ��1 ��2");
		String oper = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("������ : "+oper+", num1 :"+num1+", num2 :"+num2);

		int result = 0;
		
		if(oper.equals("+")) {
			result = num1 + num2;
		}else if(oper.equals("-")) {
			result = num1 - num2;
		}else if(oper.equals("x")) {
			result = num1 * num2;
		}else if(oper.equals("/")) {
			result = num1 / num2;
		}else {
			System.out.println("�߸��� ������ �Դϴ�.... +, -, x, / �� ����ϼ���~");
		}
		System.out.println(num1 + oper + num2+" = "+result);
		
		
		

		
		
		
		
		
	}
}
