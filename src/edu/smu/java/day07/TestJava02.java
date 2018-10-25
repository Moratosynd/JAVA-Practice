package edu.smu.java.day07;

import edu.smu.java.vo.Daughter;
import edu.smu.java.vo.Father;
import edu.smu.java.vo.Grand;
import edu.smu.java.vo.Son;

public class TestJava02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f1 = new Father();
		Son s1 = new Son();
		Daughter d = new Daughter();
		Grand g = new Grand();

		Father[] farr = new Father[4];
		farr[0] = f1;
		farr[1] = s1;
		farr[2] = d;
		farr[3] = g;

		//farr[1].cleanning(3);
		//farr[1].makemoney(3);

		for (int i = 0; i < farr.length; i++) {
			if (farr[i] instanceof Grand) {
				Grand ff4 = (Grand) farr[i];
				System.out.println(ff4.playGame(3));
			} else if (farr[i] instanceof Daughter) {
				Daughter ff3 = (Daughter) farr[i];
				System.out.println(ff3.makeup(3));
			
			} else if (farr[i] instanceof Son) {
				Son ff2 = (Son) farr[i];
				System.out.println(ff2.enjoy(3));
			} else if (farr[i] instanceof Father) {
				Father ff1 = farr[i];
				System.out.println(ff1.cleanning(3));
			}
		}
		
		System.out.println("--------------------------");
		
		for(int i=0;i<farr.length;i++) {
			System.out.println(farr[i].makemoney(3));
		}
		Father f11 = new Father();
		f11.makemoney(3);
		Father f12 = new Son();
		f12.makemoney(3);
		Father f13 = new Daughter();
		f13.makemoney(3);
		Father f14 = new Grand();
		f14.makemoney(3);
		
	}

}



