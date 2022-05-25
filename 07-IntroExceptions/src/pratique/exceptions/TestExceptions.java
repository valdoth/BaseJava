package pratique.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TestExceptions {

	public static void method1() {
		System.out.println("BEGIN method1");
		method2();
		System.out.println("END method1");
	}
	
	public static void method2() {
		System.out.println("BEGIN method2");
		method3();
		System.out.println("END method2");
	}
	
	public static void method3() {
		System.out.println("BEGIN method3");
		int value = (int) (Math.random() * 3);
		if (value == 0) {
			throw new RuntimeException("value cannot be null");
		} else {
			int res = 1 / value;
			System.out.println("Res == " + res);
		}
		while (true) {
			try {
				FileOutputStream fos = new FileOutputStream("save.data");
				fos.write("Ok\n".getBytes());
				fos.close();
				break;
			} catch (FileNotFoundException exception) {
				
			} catch (Exception exception) {
				System.out.println("Problème d'éxriture. Voulez-vous recommencer : ");
				try (Scanner scanner = new Scanner(System.in)) {
					String response = scanner.nextLine();
					if (response.equalsIgnoreCase("non")) {
						break;
					}
				}
			}
		}
		System.out.println("END method3");
	}
	
	public static void main(String[] args) {
		System.out.println("BEGIN main");
		method1();
		System.out.println("END main");
	}
	
}
