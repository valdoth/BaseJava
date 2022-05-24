
public class TypesFlottants {

	public static void main(String[] args) {
		
		float f1 = 3.6f;	// 4 octet en memoire
		double f2 = 3.141592654;	// 8 octet en memoire
		System.out.println(f1);
		System.out.println(f2);
		
		// 2 formes de représentation de flottants
		double first = 1.234;	// syntace classique
		double second = 1234e-3;	// Notation exponentielle (mantise - exposant)
		System.out.println(first);
		System.out.println(second);
	
		double result = 1 / 3;
		System.out.println(result);
		double result1 = 1. / 3;
		System.out.println(result1);
		
		// valeurs possibles
		double essai1 = 3.1415;
		double essai2 = 3 / 0.0;
		double essai3 = 0.0 / 0.0;
		System.out.println(essai1 + " " + essai2 + " " + essai3 + " " + Double.POSITIVE_INFINITY); 
		
		float fl1 = 3.6f;
		float fl2 = Float.NaN;
		float fl3 = Float.NEGATIVE_INFINITY;
		System.out.println(Float.isFinite(fl1) + " " + Float.isNaN(fl2) + " " + Float.isInfinite(fl3));
		
		
	}

}
