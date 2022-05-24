import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MegaGame {

	private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		
		int value = (int) (Math.random() * 100) + 1; // value entre 1 et 100
 		System.out.println("Random value: " + value);
 		
 		int editedValue;
 		int score = 0;
 		
 		do {
 			
 			System.out.print("Veuillez saisir une value (1...100) : ");
 			editedValue = Integer.parseInt(keyboard.readLine());
 			
 			if(editedValue < value) {
 				System.out.println("La valeur à trouver est plus grande que " + editedValue);
 				score++;
 			} else if(editedValue > value) {
 				System.out.println("La valeur à trouver est plus petite que " + editedValue);
 				score++;
 			}
 			
 		} while( editedValue != value);
 		System.out.println("Bravo, vous avez trouvé  en " + (score + 1) + " coups.");
		 
	}

}
