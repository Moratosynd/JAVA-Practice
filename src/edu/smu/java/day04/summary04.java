package edu.sum.java.day4;

public class summary04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result= time(5);
		if(result == true) {
			System.out.println("걱정말아요 그때 끝낼거예요");
		}else {
			System.out.println("이놈 안되");
		}
	}

	static boolean time (int t){
		if(t <= 5) {
			return false;
		}
		
		System.out.println("수업이 "+t+"시에 끝나면 얼마나 좋을까");
		
		return true;
	}
}


