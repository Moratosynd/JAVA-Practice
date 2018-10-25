package edu.java.smu.cli;

import edu.java.smu.aven.Animal;
import edu.java.smu.aven.Bird;
import edu.java.smu.aven.Dog;
import edu.java.smu.aven.Fish;
import edu.java.smu.aven.Human;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] arr = new Animal[6]; 
		arr[0] = new Animal();
		arr[1] = new Bird();
		arr[2] = new Human();
		arr[3] = new Fish();
		arr[4] = new Dog();
		arr[5] = new AntMan();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].move();
		}
		
	}

}
