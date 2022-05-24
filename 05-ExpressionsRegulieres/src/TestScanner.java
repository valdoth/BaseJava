import java.io.InputStream;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws Exception {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Veuillez saisir votre login: ");
			String login = scanner.nextLine();
			System.out.println("Veuillez saisir votre mot de passe : ");
			String password = scanner.nextLine();
			if(login.equalsIgnoreCase("bond") && password.equals("007")) {
				System.out.println("You are connected");
			} else {
				System.out.println("Who are you?");
			}
			System.out.println("How many spies are you killed : ");
			int count  = scanner.nextInt();
			if(count > 100) {
				System.out.println("You are a great spy!!!");
			}
		}
		System.out.println("-----------------------------");
		
		ProcessBuilder processBuilder = new ProcessBuilder("ifconfig");
		processBuilder.redirectErrorStream(true);
		Process process = processBuilder.start();
		InputStream processOutput = process.getInputStream();
		try(Scanner scanner = new Scanner(processOutput)) {
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				if(line.length() > 0 && line.charAt(0) != ' ') {
					System.out.println(line);
				}
				System.out.println("-------------------------------------------------\nBye bye");
			}
		} 
		
	}

}
