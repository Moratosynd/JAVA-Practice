package edu.smu.java.day06;

import edu.smu.java.vo.Contact;
import edu.smu.java.vo.Customer;
import edu.smu.java.vo.FriendContact;
import edu.smu.java.vo.VipCustomer;

public class Main06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c = new Contact("고길동","서울시",51);
		System.out.println(c.toString());
		
		
		FriendContact fc = new FriendContact("홍길동","천안시",21,"20120812");
		System.out.println(fc.toString());
		
		
//		Customer cus = new Customer("박길동","010999999");
//		cus.getName();
//		cus.getTel();
//		cus.toString();
//		System.out.println(cus.toString());
//		
//		VipCustomer vc = new VipCustomer("갑돌이", "01088888", "갑질");
//		vc.getName();
//		vc.getTel();
//		vc.getHobby();
//		vc.toString();
//		System.out.println(vc.toString());
		
	
	}

}
