package pratique.poo;

public class Start {

	public static void main(String[] args) {
		
		Rational r1 = new Rational();
		System.out.println(r1);
		
		r1.setNumerator(3);
		r1.setDenominator(4);
		
		System.out.println(r1.toString());

		Rational r2 = new Rational(5, 9);
		System.out.println(r2.toString());
 
		Rational result = r1.add(r2);
		System.out.println(r1 + "+" + r2 + " == " + result);
		
		System.out.println(r1 + "<" + r2 + " == " + r1.lessThan(r2));
		
		Rational r3 = new Rational(16, 24);
		System.out.println(r3);
		r3.simplify();
		System.out.println(r3);
		
	}
		
}
//<>