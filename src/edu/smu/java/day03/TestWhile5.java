package edu.smu.java.day3;

import java.util.Scanner;

public class TestWhile5 {

	public static void main(String[] args) {

		int com = (int)(Math.random()*100) + 1;		
		int count = 1;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			
			System.out.println(count+" ��° : 1~100 ���̿� ���ڸ� �Է��ϼ���");
			int user = sc.nextInt(); 
			if(com>user) {
				System.out.println("����ڰ� �Է��� ���� "+user+"�� ���� �� �۽��ϴ�...");
			}else if(com<user) {
				System.out.println("����ڰ� �Է��� ���� "+user+"�� ���� �� Ů�ϴ�...");
			}else {
				System.out.println("��÷.....������ : "+user+" �̰� Ƚ���� "+ count);
				break;
				//flag = false;
			}
			count++;
			
		}
		
	}

}
