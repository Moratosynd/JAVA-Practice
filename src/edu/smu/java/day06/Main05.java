package edu.smu.java.day06;

import java.util.Scanner;

import edu.smu.java.vo.Contact;

// �ּҷ� ���α׷�
public class Main05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact[] arr = new Contact[5];
		Scanner s = new Scanner(System.in);
		int index = 0;

		while (true) {
			// �׸��� 1.���, 2.�Է�, 3.����, 4.����, 5.�˻�
			System.out.println("1.���, 2.�Է�, 3.����, 4.����, 5.�˻�, 6.����");
			int menu = s.nextInt();
			switch (menu) {
			case 1:
				contactPrint(arr,index);
				break;
			case 2:
				index = contactAdd(arr, index);
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			default:
				System.exit(0);	
				break;
			}
		}
	}
	public static void contactPrint(Contact[] arr, int index) {
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i].toString());

		}
	}
	public static int contactAdd(Contact[] arr, int ix) {
		Scanner s = new Scanner(System.in);
		arr[ix] = new Contact();
		System.out.println("�̸�");
		arr[ix].setName(s.next());
		System.out.println("����");
		arr[ix].setAge(s.nextInt());
		System.out.println("�ּ�");
		arr[ix].setAddr(s.next());
		ix++;
		return ix;
	}
	
	
}
