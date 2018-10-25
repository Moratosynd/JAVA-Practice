package edu.smu.java.day06;
import edu.smu.java.vo.Father;
import edu.smu.java.vo.Son;

public class Main08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		Son s = new Son();
		
		Father fa = (Father) new Son();
		Son sa = (Son)new Father();
		
	}

}
