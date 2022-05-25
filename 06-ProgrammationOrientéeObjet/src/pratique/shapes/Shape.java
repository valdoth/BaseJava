package pratique.shapes;

import java.awt.Point;

public abstract class Shape {

	private Point center;
	
	public Shape() {
		this (new Point(0, 0));
	}
	
	public Shape(Point center) {
		this.setCenter(center);
	}
	
	public Point getCenter() {
		return center;
	}
	 
	public void setCenter(Point center) {
		if (center == null ) {
			throw new NullPointerException("Center cannot be null");
		}
		this.center = center;
	}
	
	public abstract double area();
	public abstract void draw();

}
