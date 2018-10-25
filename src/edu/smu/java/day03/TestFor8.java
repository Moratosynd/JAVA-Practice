package edu.smu.java.day3;

import java.util.Scanner;

public class TestFor8 {

	public static void main(String[] args) {
		
		//합을 구하여 출력하기....
		//1, 1+2, 1+2+3, 1+2+3+4, 1+2+3+4+5, ~~~~~ 1+2+...+10
		int sum = 0;
		int total = 0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;    		//1 -> 3
			total= total + sum;		//1
		}
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				
			}
		}
		
		

	}

}
