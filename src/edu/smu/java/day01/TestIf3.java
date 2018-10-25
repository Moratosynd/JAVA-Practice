package edu.smu.java.day1;

import java.util.Scanner;

public class TestIf3 {

	public static void main(String[] args) {

		//계산기 프로그램을 작성해 보자...
		//입력을 Scanner로 받는데   연산자 값1 값2 : 예) + 4 2, - 4 2, x 4 2, / 4 2
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 동진 계산기 ==========");
		System.out.println("사용방법 : 연산자(+ - x /) 값1 값2");
		String oper = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("연산자 : "+oper+", num1 :"+num1+", num2 :"+num2);

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
			System.out.println("잘못된 연산자 입니다.... +, -, x, / 를 사용하세요~");
		}
		System.out.println(num1 + oper + num2+" = "+result);
		
		
		

		
		
		
		
		
	}
}
