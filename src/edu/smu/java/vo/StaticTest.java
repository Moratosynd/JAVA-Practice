package edu.smu.java.vo;

public class StaticTest {
	// instance val;
	public int i;
	// static val;
	public static int s;
	
	public void iPrint() {
		System.out.println("�ν��Ͻ� �Լ�");
	}
	
	public static void sPrint() {
		System.out.println("static �Լ�");
		System.out.println(s);
		
	}
	
	public Inner getInstace(){
		return new Inner();
	}
	
	public static class Inner{
		
	}
}
