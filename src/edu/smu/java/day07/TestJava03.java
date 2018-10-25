package edu.smu.java.day07;

import edu.smu.java.vo.StaticTest;
import edu.smu.java.vo.StaticTest.Inner;

public class TestJava03 {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest st = new StaticTest();
		st.i = 100;
		st.s = 500;
		StaticTest.s = 100;
		
		
		StaticTest st1 = new StaticTest();
		st1.i = 200;
		
		System.out.println(st.i);
		System.out.println(st1.i);
		System.out.println(st.s);
		System.out.println(st1.s);
		
		st1.s = 10;
		System.out.println(st.s);
		
		StaticTest.s = 900;
		System.out.println(st.s);
		System.out.println(st1.s);
		
		st.iPrint();
		st.sPrint();
		
		StaticTest.sPrint();
		
		Math.min(3, 1);
		double pi = Math.PI;
		Math.cos(41.2);
		
		StaticTest.Inner in = new StaticTest.Inner();
		
		
		
	}
}


