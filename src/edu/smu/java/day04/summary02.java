package edu.sum.java.day4;

import java.util.Random;
import java.util.Scanner;

public class summary02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int a = r.nextInt(10) + 1;
		System.out.println(a);
		// System.out.println("1 ~ 100 사이의 값을 입력하세요");

		switch (a) {
		case 10:
		case 9:
			System.out.println("A 입니다.");
			
		case 8:
			System.out.println("B 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;
		default:
			System.out.println("F 입니다.");
		}

		// int a = s.nextInt();

		/*
		 * if(a > 90) { System.out.println("A 입니다."); }else if(a > 80) {
		 * System.out.println("B 입니다."); }else if(a > 70) {
		 * System.out.println("C 입니다."); }else if(a > 60) {
		 * System.out.println("D 입니다."); }else { System.out.println("F 입니다."); }
		 */

	}

}
