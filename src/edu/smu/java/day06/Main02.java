package edu.smu.java.day06;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = new double[10];
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextDouble();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
