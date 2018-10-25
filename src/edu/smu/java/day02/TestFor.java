package edu.smu.java.day2;

public class TestFor {

	public static void main(String[] args) {
		// For 연습 코드....
		// 1 ~ 10까지 값을 출력하는 코드를 작성해 보자....
		//초기값;조건식;증가식
		//i++ -> i = i + 1;
		for(int i=1;i<11;i++) {
			//System.out.println(i);
		}
		
		//1~ 100까지의 합을 구해서 출력할 것...
		//초기치, 조건식, 증가식
		int sum = 0;
		//for(int a = 1; a <= 100 ; a=a+1 ) {
		//반복해서 수행할 코드...	
//			sum = sum + 1;
//			sum = sum + 2;
//			sum = sum + 3;
//			sum = sum + 4;
		//}
		
		for(int a = 1; a<=100 ;a++) {
			sum = sum + a;
		}
		System.out.println("100까지 합 : "+sum);
		
		
		

	}

}





