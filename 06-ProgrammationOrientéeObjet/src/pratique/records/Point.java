package pratique.records;

public record Point(double x, double y) {
	
	public Point() {
		this(0, 0);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void doSomething() {
		// Accès aux attributs du record
		System.out.printf("%f, %f with attributes\n", this.x, this.y);
		// Accèss aux méthodes d'accès du record
		System.out.printf("%f, %f with accessors\n", this.x(), this.y());
	}
	
}
