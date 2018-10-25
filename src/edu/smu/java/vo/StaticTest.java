package edu.smu.java.vo;

public class StaticTest {
	// instance val;
	public int i;
	// static val;
	public static int s;
	
	public void iPrint() {
		System.out.println("인스턴스 함수");
	}
	
	public static void sPrint() {
		System.out.println("static 함수");
		System.out.println(s);
		
	}
	
	public Inner getInstace(){
		return new Inner();
	}
	
	public static class Inner{
		
	}
}
