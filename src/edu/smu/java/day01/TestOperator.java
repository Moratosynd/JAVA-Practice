package edu.smu.java.day1;

public class TestOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//11, 6 이라는 두개의 값이 있다.. 더하기, 빼기, 곱하기, 나누기, 나머지 연산한 결과를 출력하세요..
		int a = 11;
		int b = 6;
		
		int hap = a + b;
		int minus = a-b;
		int gub = a * b;
		int nanugi = a/b;
		double nanugi1 = (a/b); 
		int namugi = a % b;
		
		System.out.println( a +"+"+ b +"=" +(a + b)); 
		System.out.println( a +"*"+ b +"=" +(a * b)); 
		System.out.println( a +"-"+ b +"=" +(a - b)); 
		System.out.println( a +"/"+ b +"=" +(a / b));
		System.out.println( a +"%"+ b +"=" +(a % b));
		
		
		
		

	}

}
