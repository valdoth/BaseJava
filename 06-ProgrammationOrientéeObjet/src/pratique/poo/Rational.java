package pratique.poo;

public class Rational {

	// Les attributs de la classe Rational
	private int numerator; 		// = 0;
	private int denominator; 	// = 1;
	
	//constructor
	public Rational() {
		this(0, 1);
		//this.setNumerator(0);
		//this.setDenominator(1);
	}
	
	public Rational(int numerator, int denominator) {
		super();
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	}

	// property
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {		
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if(denominator == 0) {
			throw new RuntimeException("denominator cannot be null");
		}
		this.denominator = denominator;
	}
	
	
	public Rational add(Rational r2) {
		return new Rational(
				this.numerator * r2.denominator + this.denominator * r2.numerator,
				this.denominator * r2.denominator
		);
	}
	
	public boolean lessThan(Rational r2) {
		return this.numerator * r2.denominator < this.denominator * r2.numerator; 
	}
	
	private static int pgcd(int first, int second) {
		while (second != 0) {
			int reste = first % second;
			first = second;
			second = reste;
		}
		return first; 
	}
	
	public void simplify() {
		int divisor = pgcd(Math.max(this.numerator, this.denominator), Math.min(this.numerator, this.denominator));
		this.setNumerator(this.numerator / divisor);
		this.setDenominator(this.denominator / divisor);
	}
	
	
	@Override
	public String toString() {
		return String.format("[%d/%d]", this.numerator, this.denominator);
	}
	
	
}
