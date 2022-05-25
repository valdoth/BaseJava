package pratique.shapes;

import java.awt.Point;

public class Square extends Shape {
	
	private double length;
	
	public Square() {
		super();
		this.setLength(1);
	}

	public Square(Point center, double length) {
		super(center);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double area() {
		return this.length * this.length;
	}
	
	@Override
	public void draw() {
		System.out.println("Un carré positionné en " + this.getCenter() + " et de longueur " + this.length);
	}
	
}
