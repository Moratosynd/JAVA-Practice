package edu.smu.java.day1;

import java.util.Scanner;

public class TestSeconds {

	public static void main(String[] args) {
		
		//Ű����κ��� ���� ���� �Է¹ް� ������ ����ϴ� �ڵ�
		Scanner sc = new Scanner(System.in);
		
		// 3800��
		//int data = 7800;
		System.out.println("��ȯ��ų �����͸� �ʴ����� �Է��ϼ���....");
		int data = sc.nextInt();
		//�־��� �����͸�  ~~�ð� ~~��  ~~�ʷ� ����ϴ� ���α׷��� ������ ��
		//����ϼ���... ������ ������ int type�� h, m, s
		int h = data / 3600;
		int m = (data % 3600) / 60;
		int s = (data % 3600) % 60;

		System.out.println(data+ "�ʴ� "+h +" �ð� "+ m +" ��"+ s +" �� �Դϴ�..");

	}

}
