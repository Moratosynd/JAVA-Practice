package edu.smu.java.day06;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		
		Scanner s = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i] = (char) s.next().charAt(0);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
