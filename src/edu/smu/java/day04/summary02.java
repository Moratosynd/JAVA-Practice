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
		// System.out.println("1 ~ 100 ������ ���� �Է��ϼ���");

		switch (a) {
		case 10:
		case 9:
			System.out.println("A �Դϴ�.");
			
		case 8:
			System.out.println("B �Դϴ�.");
			break;
		case 7:
			System.out.println("C �Դϴ�.");
			break;
		case 6:
			System.out.println("D �Դϴ�.");
			break;
		default:
			System.out.println("F �Դϴ�.");
		}

		// int a = s.nextInt();

		/*
		 * if(a > 90) { System.out.println("A �Դϴ�."); }else if(a > 80) {
		 * System.out.println("B �Դϴ�."); }else if(a > 70) {
		 * System.out.println("C �Դϴ�."); }else if(a > 60) {
		 * System.out.println("D �Դϴ�."); }else { System.out.println("F �Դϴ�."); }
		 */

	}

}
