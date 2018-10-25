package edu.smu.java.day3;

import java.util.Scanner;

public class TestWhile5 {

	public static void main(String[] args) {

		int com = (int)(Math.random()*100) + 1;		
		int count = 1;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			
			System.out.println(count+" 번째 : 1~100 사이에 숫자를 입력하세요");
			int user = sc.nextInt(); 
			if(com>user) {
				System.out.println("사용자가 입력한 숫자 "+user+"의 값이 더 작습니다...");
			}else if(com<user) {
				System.out.println("사용자가 입력한 숫자 "+user+"의 값이 더 큽니다...");
			}else {
				System.out.println("당첨.....정답은 : "+user+" 이고 횟수는 "+ count);
				break;
				//flag = false;
			}
			count++;
			
		}
		
	}

}
