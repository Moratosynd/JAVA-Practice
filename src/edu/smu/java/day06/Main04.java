package edu.smu.java.day06;

import java.util.Scanner;
// �ּҷ� ���α׷�
public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[10];
		String[] addr = new String[10];
		
		Scanner s = new Scanner(System.in);
		System.out.println("------- �ּҷ� ----------");
		
		for(int i=0;i<10;i++) {
			System.out.println("�̸��� �Է��ϼ���");
			names[i] = s.nextLine();
			System.out.println("�ּҸ� �Է��ϼ���");
			addr[i] = s.nextLine();
		}
		
		
		for(int i=0;i<10;i++) {
			System.out.print("����� ģ�� �̸��� : ");
			System.out.print(names[i]);
			System.out.print(", ����� ģ�� �ּҴ� : ");
			System.out.print(addr[i]);
			System.out.println(" �Դϴ�");
		}
		
	}

}
