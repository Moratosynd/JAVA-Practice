package edu.smu.java.day07;

import edu.smu.java.vo.Father;
import edu.smu.java.vo.Son;

public class TestJava01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		Son s = new Son();
		
		System.out.println(f.makemoney(3));
		System.out.println(f.value);
		
		System.out.println("--------------------------");
		System.out.println(s.makemoney(3));
		System.out.println(s.value);
		
		System.out.println("--------------------------");
		
		Father fa = new Son();
		
		System.out.println(fa.makemoney(3));
		System.out.println(fa.value);
		
		//Son ss = new Father();
		
		Son ss = (Son)fa;
		System.out.println(ss.enjoy(4));
	}

}
