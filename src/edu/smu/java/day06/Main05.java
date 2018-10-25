package edu.smu.java.day06;

import java.util.Scanner;

import edu.smu.java.vo.Contact;

// 주소록 프로그램
public class Main05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact[] arr = new Contact[5];
		Scanner s = new Scanner(System.in);
		int index = 0;

		while (true) {
			// 항목선택 1.출력, 2.입력, 3.수정, 4.삭제, 5.검색
			System.out.println("1.출력, 2.입력, 3.수정, 4.삭제, 5.검색, 6.종료");
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
		System.out.println("이름");
		arr[ix].setName(s.next());
		System.out.println("나이");
		arr[ix].setAge(s.nextInt());
		System.out.println("주소");
		arr[ix].setAddr(s.next());
		ix++;
		return ix;
	}
	
	
}
