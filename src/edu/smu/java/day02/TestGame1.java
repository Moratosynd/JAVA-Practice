package edu.smu.java.day2;

import java.util.Scanner;

public class TestGame1 {

	public static void main(String[] args) {
		//컴퓨터가 낼 경우의 수를 프로그램으로 구현하기 (가위:0, 바위:1, 보:2)
		int computer = (int)(Math.random()*3);
		
		//User : 키보드로 가위, 바위, 보를 입력받느다....
		Scanner sc = new Scanner(System.in);		
		System.out.println("가위(0), 바위(1),  보(2) 중에 하나를 숫자로 입력하세요.."); 
		int user = sc.nextInt();
		
		//둘다 같은 숫자를 낸 경우...
		if(user == computer) {
			System.out.println("비겼습니다.... 내가 낸것은 : "+user);
		//user 기준 : 가위인 경우	
		}else if(user == 0) {
			if(computer == 1) {
				System.out.println(computer + " : 컴퓨터가 이겼네요...... 내가 낸것은 : "+user);
			//computer == 2	
			}else {
				System.out.println(computer + " :컴퓨터가 졌네요...... 내가 낸것은 : "+user);
			}
		//user 기준 : 바위인 경우			
		}else if(user == 1) {
			if(computer == 0) {
				System.out.println(computer + " : 컴퓨터가 졌네요...... 내가 낸것은 : "+user);
			}else {
				System.out.println(computer + " : 컴퓨터가 이겼네요...... 내가 낸것은 : "+user);
			}
		//user 기준 : 보인 경우			
		}else {
			if(computer == 0) {
				System.out.println(computer + " : 컴퓨터가 이겼네요...... 내가 낸것은 : "+user);
			}else {
				System.out.println(computer + " : 컴퓨터가 졌네요...... 내가 낸것은 : "+user);
			}
		}

	}

}
