package pratique.shapes;

import java.awt.Point;

public class Circle extends Shape {

	private double radius;
	
	public Circle() {
		super();
		this.setRadius(1);
	}
	
	public Circle(Point center, double radius) {
		super(center);
		this.setRadius(radius);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = Math.abs(radius);
	}
	
	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	@Override
	public void draw() {
		 System.out.println("Un cercle positioné en " + this.getCenter() + " et de rayon " + this.radius);
	}
	
}
