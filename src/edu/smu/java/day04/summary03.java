package edu.sum.java.day4;

public class summary03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		// while(a < 3000){
		// System.out.println("빨리끝나면 좋겠어요 : "+ a);
		// //a = a + 1;
		// //a += 1;
		// a ++;
		// }
		int num = 1;
		int dan = 2;
		while (dan <= 9) {
			num = 1;
			while (num <= 9) {
				System.out.println(dan + " * " + num + " = " + dan * num);
				num++;
			}
			dan++;
		}
		System.out.println("---------for--------");

		for(int dan2=2;dan2<=9;dan2++){
			if (dan ==7) {
				continue;
			}
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan2 +" * " + i + " = " + dan2 * i);
				if(i == 7) {
					break;
				}
			}
		
		}

	}

}
