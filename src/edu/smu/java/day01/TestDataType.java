package edu.smu.java.day1;

import java.util.Scanner;

public class TestDataType {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ���������� �Է��ϼ��� �Է¼����� ������ �����ϴ�. ");
		System.out.println("�̸�(���ڿ�), �г�(int), ���ʽ÷�(double), ������ �÷�(double), �ּ�(���ڿ�)");
		
		String name = sc.next();
		int grade = sc.nextInt();
		double leftEye = sc.nextDouble();
		double rightEye = sc.nextDouble();
		String address = sc.next();
		
		/*
		String name = "��ȫ��";
		int grade = 3;
		String sGrade = 3+"";
		double leftEye = 0.6;
		double rightEye = 1.2;
		String address = "�ƻ�";
		*/
		
		
		System.out.println("���� �̸���"+ name +"�̰� ���� "+grade
				+"�г��̸� �÷��� (���ʴ� : "+leftEye+", �����ʴ� : "+rightEye+") "
						+ "�Դϴ�.\n ��� �ִ� ����"+address+"�Դϴ�...");
		//��� �ִ� ���� �����Դϴ�...
		
		
		
		
		

	}

}
