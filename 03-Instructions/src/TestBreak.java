
public class TestBreak {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-------------------------------");
		
		for(int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if (i == 5 && j == 5) {
					break;
				}
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		System.out.println("----------------------------");
		
		// création d'une etiquette
		firstloop:
		for(int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if (i == 5 && j == 5) {
					break firstloop;
				}
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
		
		System.out.println("Bye bye");
		
	} 
	 
}
