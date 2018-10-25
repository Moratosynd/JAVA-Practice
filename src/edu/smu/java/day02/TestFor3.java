package edu.smu.java.day2;

public class TestFor3 {

	public static void main(String[] args) {
		
		//For 연습 : 1~30까지의 정수중에서 3의 배수의 합과 3의 배수의 갯수를 출력하세요
		
		//1부터 30까지의 3의 배수의 합은 ~~ 이고 갯수는 ~~ 개 입니다...
		int sum = 0;
		int count = 0;
		for(int i = 1;i<=30;i++) {
			//3,6,9 ~~~30
			if(i%3 ==0) {
				sum = sum + i;
				count = count + 1;
			}			
		}
		System.out.println("3의 배수의 합은 :"+sum+", 갯수는 :"+count);
		
		
		
		
		
		

	}

}





