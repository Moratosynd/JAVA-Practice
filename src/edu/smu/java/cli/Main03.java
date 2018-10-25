package edu.java.smu.cli;

import edu.java.smu.ui.Circle;
import edu.java.smu.ui.Rectangle;
import edu.java.smu.ui.Shape;
import edu.java.smu.ui.Square;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s = new Shape();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Square sq = new Square();
		toDraw(sq);
		//toDraw(s);
		toDraw(r);
		toDraw(c);
	}
	
	
	public static void toDraw(Shape s) {
		s.draw();
	}

}
