import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestWhile {

	private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Bye bye");
	
		i = 0;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println();
		
		boolean mustExist = false;
		while(!mustExist) {
			System.out.println("Veuillez saisir une commande : ");
			String command = keyboard.readLine();
			System.out.println("Traitement de la commande " + command);
			if(command.equals("exit")) {
				System.out.println("Bye bye");
				mustExist = true;
			}
		}
		
	}

}
