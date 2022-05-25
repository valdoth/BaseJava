package pratique.exceptions;

import java.io.FileOutputStream;
import java.io.IOException;

class Demo implements AutoCloseable {
	
	public Demo() {
		System.out.println("Ressource instanciée");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Ressource libérée");
	}
}

public class FileWriter {
	
	public static void saveDateTryWithRessources() {
		try (Demo d = new Demo()) {
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void saveDataFinally() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("save.data");
			fos.write("Ok\n".getBytes());			
			System.out.println("Écriture dans le fichier terminée");
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			//System.out.println("In the finally bloc");
			if (fos != null) {
				try {
					fos.close();
					System.out.println("fermeture du fichier");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Bye bye");
		
	}
	
	public static void main(String[] args) {
		
		saveDataFinally();
		saveDateTryWithRessources();
		
	}
	
}
