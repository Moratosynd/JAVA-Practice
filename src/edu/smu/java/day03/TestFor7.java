package edu.smu.java.day3;

import java.util.Scanner;

public class TestFor7 {

	public static void main(String[] args) {

		//두 개의 양의 정수를 키보드를 통해 입력받자...
		//두 개의 숫자 포함하여 사이의 존재하는 모든 정수의 합을 구해보자....
		//1, 3 / 10, 13
		Scanner sc = new Scanner(System.in);
		System.out.println("연산할 2개의 정수 값을 차례대로 입력하세요...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a : "+a+", b : "+b);
		//1, 4 //4, 1
		int sum = 0;
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i=a;i<=b;i++) {
			sum = sum + i;
		}
		System.out.println("sum : "+sum);
		/*
		if(b>a) {
			for(int i=a;i<=b;i++) {
				sum = sum + i;
			}	
		}else {
			for(int i=b;i<=a;i++) {
				sum = sum + i;
			}
		}
		*/
		

	}

}
