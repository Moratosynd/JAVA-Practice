package edu.java.smu.main;

import edu.java.smu.aven.Animal;
import edu.java.smu.aven.Bird;
import edu.java.smu.aven.Dog;
import edu.java.smu.aven.Fish;
import edu.java.smu.aven.Human;
import edu.java.smu.aven.Man;
import edu.java.smu.aven.Superman;
import edu.java.smu.lang.IFly;
import edu.java.smu.lang.ISwim;
import edu.java.smu.lang.SunMoonObject;
import edu.java.smu.trans.Airplane;
import edu.java.smu.trans.Car;
import edu.java.smu.trans.Ship;
import edu.java.smu.trans.Trans;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal a = new Animal();
		Dog d = new Dog();
		Fish f= new Fish();
		Human h = new Human();
		Superman s = new Superman();
		Bird b = new Bird();
		
		//Trans t = new Trans();
		Airplane a = new Airplane();
		Car c = new Car();
		Ship ship = new Ship();
	
		toFly(a);
		toFly(s);
		toFly(b);
		
		Man man = new Man();
		
	}
	public static void toSwimming(ISwim f) {
		f.Swimming();
	}
	
	public static void toFly(IFly f) {
		f.fly();
	}
	
	public static void toStart(Trans a) {
		a.start();
	}
	public static void toStop(Trans a) {
		a.stop();
	}
	public static void toMove(Animal a) {
		a.move();
	}

}
