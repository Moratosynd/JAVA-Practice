package edu.smu.java.day3;

import java.util.Scanner;

public class TestFor7 {

	public static void main(String[] args) {

		//�� ���� ���� ������ Ű���带 ���� �Է¹���...
		//�� ���� ���� �����Ͽ� ������ �����ϴ� ��� ������ ���� ���غ���....
		//1, 3 / 10, 13
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 2���� ���� ���� ���ʴ�� �Է��ϼ���...");
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
