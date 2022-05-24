import java.util.Arrays;

public class TypeAuto {

	public static void main(String[] args) {
		
		// Exemple classique
		var value = 18; // var va déduire le type de la variable à partir de la valeur d'initialisation
		System.out.println(value);
		
		value = 23;
		System.out.println(value);
		
		// Auto-typage de la variable grâve à une construction d'object
		var date = new java.util.Date();
		System.out.println(date.getClass().getName());
		System.out.println(date);
	
		// Auto-typage de grâce à la valeur de retour d'une méthode
		var path = System.getProperty("java.class.path");
		System.out.println(path);
		
		path = "toto"; // marche car la valeur de path precedente est une chaîne de caractère
		System.out.println(path);
		
		// Auto-typage de la valeur grâce à la valeur de retour d'une méthode générique
		var arr = Arrays.asList(10, 20, 30);
		System.out.println(arr);
		
		for (var i : arr) {
			System.out.println(i);
		}
		
	}

}
