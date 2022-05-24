
public class TypeCharacter {

	public static void main(String[] args) {
		
		// Attention entre chaîne de caractère("") et caractère('')
		String theStr = "Une chaîne de caractères";
		System.out.println(theStr);
		char theChar = 'a';
		System.out.println(theChar);
		
		// Le syntaxe est héritée de C, on retrouve les même sequences pour certain caractère spéciaux
		char retourALaLigne = '\n';
		char tabulation = '\t';
		System.out.println("BEGIN" + retourALaLigne + "MIDDLE" + tabulation + "END");
		
		// En java, on utilise UNICODE et non ASCII (American Standard Coding for Information Interchange)
		// En ASCII (ou derive: ISO-8859-1), 1 caractère = 1 octet en mémoire donc 256 caractére au maximum
		// En UNICODE, 1 caractère = 2 octet en mémoire donc on peut utiliser des millions de caractère.
		char piMaj = '\u03a0';
		// char piMin = '\u03c0'; // codification en hexadécima
		char piMin = 960;	// codification en décimal
		char test = '\u3df7';
		System.out.println(piMaj + "  " + piMin + "   " + test);
		
		// Des methodes statistiques vous sont proposées pour tester vos caractères
		boolean isDigit = (Character.isDigit(theChar));
		System.out.println(isDigit);
		boolean isLetter = Character.isLetter(piMin);
		System.out.println(isLetter);
		boolean isUpperCase = Character.isUpperCase(piMin);
		System.out.println(isUpperCase);
		
	}

}
