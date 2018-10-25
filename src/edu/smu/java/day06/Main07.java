package edu.smu.java.day06;

import javax.print.attribute.standard.MediaSize.Engineering;

import edu.smu.java.vo.Enginneer;
import edu.smu.java.vo.Father;
import edu.smu.java.vo.Programmer;
import edu.smu.java.vo.Sawon;
import edu.smu.java.vo.Son;

public class Main07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f = new Father();
		System.out.println(f.makemoney(3));
		Son s = new Son();
		System.out.println(s.makemoney(2));
		System.out.println(s.cleanning(3));
		System.out.println(s.enjoy(3));
		
		Sawon sa = new Sawon();
		System.out.println(sa.pay());
		
		Enginneer en = new Enginneer();
		System.out.println(en.pay());
		
		Programmer p = new Programmer();
		System.out.println(p.pay());
	}

}
