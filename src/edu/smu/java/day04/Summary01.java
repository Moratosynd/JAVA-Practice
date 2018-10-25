package edu.sum.java.day4;

public class Summary01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 4;
		System.out.println(a + b);
		
		if(a > b){	
			System.out.println("a 가 b 보다 큼니다");
		}else if(a == b){
			System.out.println("a 와 b 같습니다.");
		}else{
			System.out.println("b 가 a 보다 큼니다");
		}
		
		switch(a){
		case 10:
			System.out.println(" a = 10 입니다.");
			break;
		case 9:
			System.out.println(" a = 9 입니다.");
			break;
		case 8:
			System.out.println(" a = 8 입니다.");
			break;
		case 7:
			System.out.println(" a = 7 입니다.");
			break;
		default:
				
			System.out.println(" a = 나머지 다 입니다.");
		}
		
		
	}  

}
