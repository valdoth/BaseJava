package pratique.shapes;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<Shape>(); 
		shapes.add(new Circle());
		shapes.add(new Circle(new Point(1, 1), 5));
		shapes.add(new Square(new Point(10, 10), 2));
				
		for (Shape shape : shapes) {
			shape.draw();
		}
		
		new DemoImpl();
		
	}

}
