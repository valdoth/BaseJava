package pratique.exceptions;

public class Rational {

	private int numerator;
	private int denominator;
	
	public Rational() {
		this(0, 1);
	}

	public Rational(int numerator, int denominator) {
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	}

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
		if (denominator == 0) {
			throw new RationalException("denominator cannot be null!!!!!");
		}
		this.denominator = denominator;
	}
	
	
	public Rational add(Rational r2) {
		return new Rational(
				this.numerator * r2.getDenominator() + this.getDenominator() * r2.numerator,
				this.numerator * r2.getNumerator()
		);
	}
	
	@Override
	public String toString() {
		return "[" + this.getNumerator() + "/" + this.getDenominator() + "]";
	}
	
}
