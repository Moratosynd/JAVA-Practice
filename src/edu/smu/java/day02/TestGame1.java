package edu.smu.java.day2;

import java.util.Scanner;

public class TestGame1 {

	public static void main(String[] args) {
		//��ǻ�Ͱ� �� ����� ���� ���α׷����� �����ϱ� (����:0, ����:1, ��:2)
		int computer = (int)(Math.random()*3);
		
		//User : Ű����� ����, ����, ���� �Է¹޴���....
		Scanner sc = new Scanner(System.in);		
		System.out.println("����(0), ����(1),  ��(2) �߿� �ϳ��� ���ڷ� �Է��ϼ���.."); 
		int user = sc.nextInt();
		
		//�Ѵ� ���� ���ڸ� �� ���...
		if(user == computer) {
			System.out.println("�����ϴ�.... ���� ������ : "+user);
		//user ���� : ������ ���	
		}else if(user == 0) {
			if(computer == 1) {
				System.out.println(computer + " : ��ǻ�Ͱ� �̰�׿�...... ���� ������ : "+user);
			//computer == 2	
			}else {
				System.out.println(computer + " :��ǻ�Ͱ� ���׿�...... ���� ������ : "+user);
			}
		//user ���� : ������ ���			
		}else if(user == 1) {
			if(computer == 0) {
				System.out.println(computer + " : ��ǻ�Ͱ� ���׿�...... ���� ������ : "+user);
			}else {
				System.out.println(computer + " : ��ǻ�Ͱ� �̰�׿�...... ���� ������ : "+user);
			}
		//user ���� : ���� ���			
		}else {
			if(computer == 0) {
				System.out.println(computer + " : ��ǻ�Ͱ� �̰�׿�...... ���� ������ : "+user);
			}else {
				System.out.println(computer + " : ��ǻ�Ͱ� ���׿�...... ���� ������ : "+user);
			}
		}

	}

}
