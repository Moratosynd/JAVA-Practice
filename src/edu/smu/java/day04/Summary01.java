package edu.sum.java.day4;

public class Summary01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 4;
		System.out.println(a + b);
		
		if(a > b){	
			System.out.println("a �� b ���� ŭ�ϴ�");
		}else if(a == b){
			System.out.println("a �� b �����ϴ�.");
		}else{
			System.out.println("b �� a ���� ŭ�ϴ�");
		}
		
		switch(a){
		case 10:
			System.out.println(" a = 10 �Դϴ�.");
			break;
		case 9:
			System.out.println(" a = 9 �Դϴ�.");
			break;
		case 8:
			System.out.println(" a = 8 �Դϴ�.");
			break;
		case 7:
			System.out.println(" a = 7 �Դϴ�.");
			break;
		default:
				
			System.out.println(" a = ������ �� �Դϴ�.");
		}
		
		
	}  

}
