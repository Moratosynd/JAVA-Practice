package edu.smu.java.day1;

import java.util.Scanner;

public class TestSeconds {

	public static void main(String[] args) {
		
		//키보드로부터 값을 직접 입력받고 싶을때 사용하는 코드
		Scanner sc = new Scanner(System.in);
		
		// 3800초
		//int data = 7800;
		System.out.println("변환시킬 데이터를 초단위로 입력하세요....");
		int data = sc.nextInt();
		//주어진 데이터를  ~~시간 ~~분  ~~초로 계산하는 프로그램을 구현한 후
		//출력하세요... 선언할 변수는 int type의 h, m, s
		int h = data / 3600;
		int m = (data % 3600) / 60;
		int s = (data % 3600) % 60;

		System.out.println(data+ "초는 "+h +" 시간 "+ m +" 분"+ s +" 초 입니다..");

	}

}
