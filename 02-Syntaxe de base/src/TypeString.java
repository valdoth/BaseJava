
public class TypeString {

	public static void main(String[] args) {
		
		String message = "This is a String with Unicode characters (\u03c0)";
		System.out.println(message);
		
		// Des opérateur permettant de manipuler vos chaînes caractères
		String start = "Start";
		start = start + " After";	// Attention la concaténation de String peut couter cher
		start += " End";
		System.out.println(start);
		
		// La classe String propose un certain nombre de méthodes
		// ATTENTION: une chaîne de caractères est immutable. Il est impossible de changer son contenu.
		// 			  Mais en peut produire une nouvelle chaîne de caractères à partir d'une autre
		String upper = message.toUpperCase();
		System.out.println(upper);
		String lower = message.toLowerCase();
		System.out.println(lower);
		System.out.println(message);
		
		String subPart = message.substring(22, 29);
		System.out.println(subPart);
		
		String [] parts = message.split(" ");
		for(String str: parts) {
			System.out.print(str + " - ");
		}
		System.out.println();
		System.out.println(parts);
		
		String replacement = message.replace("String", "Truc");
		System.out.println(replacement);
		
		// Pour transformer des chaînes de caractère en nombres et des nombres en chaînes
		String strValue = "123";
		int value1 = Integer.parseInt(strValue);
		strValue = "3.141592654";
		double value2 = Double.parseDouble(strValue);
		System.out.println(value1 + "  " + value2);
		
		String finalString1 = value1 + "";
		finalString1 += " ";
		finalString1 += Double.toString(value2);	// encore une fois attention au concatenations
		System.out.println(finalString1);
		
		String finalString2 = String.format("%d %f", value1, value2);
		System.out.println(finalString2);

		// Attention aux comparaisons de chaîne de caractère
		String str1 = "toto";
		String str2 = "tata";
		String str3 = "toto";
		System.out.println(str1 == str2);	// Comme ça on pourrait croire que ça marche, mais il y a une optimisation sur les constantes
		System.out.println(str1 == str3);	// Ce qui est comparé se sont les adresses des deux objets en mémoires
		
		String half = "to";
		String str4 = half + half;
		System.out.println(str1 + "   " + str4 + " => " + (str1 == str4));
		System.out.println(str1.equals(str4));
		
		
	}

}
