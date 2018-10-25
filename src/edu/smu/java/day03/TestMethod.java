package edu.smu.java.day3;

public class TestMethod {

	public static void main(String[] args) {
		//a, b의 값을 입력받아 연산하는 함수를 구현해 보자...
		int a = 3;
		int b = 4;
		int r = add(a,b);
		System.out.println(r);
		printInfo("홍길동", 344);
	}
	
	//더하기 기능을 수행하는 함수...
	//[접근제한자, 사용제한자] 리턴타입 함수명 (함수의 인자값){ 구현부   }
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static void printInfo(String name, int num) {
		System.out.println("========= 환영합니다 "+name+" 님 ==========");
		System.out.println("여기는 누구나 좋아하는 원화관 "+ num +" 호 입니다");
	}
	

}






