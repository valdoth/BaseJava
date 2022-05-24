
public class TypeBolean {

	public static void main(String[] args) {
		
		boolean state1 = true;
		System.out.println(state1);
		boolean state2 = false;
		System.out.println(state2);
		
		// Attention: Java est different de C, un booléan n'est pas un entier
		// int state = 1;	// associé à true
		boolean state = true;
		while (state) {
			System.out.println("Boucle");
			state = false;
		}
		
		// Opérateur booléan: && (and)	|| (or)    ! (not)
		if (state1 && state2) {
			System.out.println("Ces deux variables sont initialisées à true");
		}
		if (state1 || state2) {
			System.out.println("L'une des variable est initialisées à true");
		}
		if(!state1) {
			System.out.println("State1 est initialisée à false");
		}
		if(!state2) {
			System.out.println("State2 est initialisée à false");
		}
		
			
	}

}
