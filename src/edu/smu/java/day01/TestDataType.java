package edu.smu.java.day1;

import java.util.Scanner;

public class TestDataType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력할 개인정보를 입력하세요 입력순서는 다음과 같습니다. ");
		System.out.println("이름(문자열), 학년(int), 왼쪽시력(double), 오른쪽 시력(double), 주소(문자열)");
		
		String name = sc.next();
		int grade = sc.nextInt();
		double leftEye = sc.nextDouble();
		double rightEye = sc.nextDouble();
		String address = sc.next();
		
		/*
		String name = "손홍민";
		int grade = 3;
		String sGrade = 3+"";
		double leftEye = 0.6;
		double rightEye = 1.2;
		String address = "아산";
		*/
		
		
		System.out.println("나의 이름은"+ name +"이고 현재 "+grade
				+"학년이며 시력은 (왼쪽눈 : "+leftEye+", 오른쪽눈 : "+rightEye+") "
						+ "입니다.\n 살고 있는 곳은"+address+"입니다...");
		//살고 있는 곳은 서울입니다...
		
		
		
		
		

	}

}
