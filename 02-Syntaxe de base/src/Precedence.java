
public class Precedence {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int result = a + (b * c);
		System.out.println(result);
		
		boolean check = ((a < 10) || (a > 90));
		if (check) {
			System.out.println("WARNING: Exceeding the limits");
		}
		
	}

}


/*
 Operateurs precedence table
 =======================================================================================
 postfix				| expr++ expr--								| More priority
 unary					| ++expr --expr								|
 multiplication			| * / %										|
 additive				| + -										|
 shift					| << >> >>>	 								|
 relational				| < > <= >= instanceof						|
 equality				| == !=										|
 bitwise				| AND &										|
 bitwise exlusice OR    | ^											|
 bitwise inclusive OR   | |											|
 logical AND			| &&										|
 logical OR				| || 										|
 ternary				| ? :										|
 assignement			| = += -= *= /= %= &= ^= |= <<= >>= >>>= 	| Less priority
 
 
*/