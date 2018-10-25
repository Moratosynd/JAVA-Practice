package edu.smu.java.day06;

import java.util.Scanner;
// 주소록 프로그램
public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[10];
		String[] addr = new String[10];
		
		Scanner s = new Scanner(System.in);
		System.out.println("------- 주소록 ----------");
		
		for(int i=0;i<10;i++) {
			System.out.println("이름을 입력하세요");
			names[i] = s.nextLine();
			System.out.println("주소를 입력하세요");
			addr[i] = s.nextLine();
		}
		
		
		for(int i=0;i<10;i++) {
			System.out.print("당신의 친구 이름은 : ");
			System.out.print(names[i]);
			System.out.print(", 당신의 친구 주소는 : ");
			System.out.print(addr[i]);
			System.out.println(" 입니다");
		}
		
	}

}
