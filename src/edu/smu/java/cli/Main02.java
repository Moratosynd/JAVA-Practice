package edu.java.smu.cli;

import edu.java.smu.aven.Animal;
import edu.java.smu.aven.Bird;
import edu.java.smu.aven.Dog;
import edu.java.smu.aven.Fish;
import edu.java.smu.aven.Human;
import edu.java.smu.aven.Superman;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Bird b = new Bird();
		Human h = new Human();
		Fish f = new Fish();
		Dog d = new Dog();
		AntMan ant = new AntMan();
		Superman s = new Superman();
		toMove(b);
		toMove(d);
		toMove(ant);
		toMove(s);
		toMove(h);
		toMove(a);
	}
	
	public static void toMove(Animal b ) {
		b.move();
	}
	

}







