
public class Mathematique {
	
	public static double mini(double a, double b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static double mini2(double a, double b) {
		return (a < b) ? a : b;
	}
	
	public static void main(String[] args) {
		
		System.out.println(mini(8.3, 5.7));
		System.out.println(mini2(8.3, 5.7));
	}

}
