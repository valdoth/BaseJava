
public class NewSwitch {

	public static void main(String[] args) {
		
		// un premier exemple basique
		int value = (int) (Math.random() * 11);
		
		switch(value) {
		// une branche case peut maintenant accepter plusieur valeurs.
		// Il n'est plus nécessaire d'utiliser le mot clé break.
			case 0, 1, 2, 3, 4 -> System.out.println("Petit chiffre"); 
			case 5, 6, 7, 8, 9 -> System.out.println("Grand chiffre");
			default -> System.out.println("Ce n'est plus un chiffre, mais un nombre");
		}
		
		// utilisation de switch sous forme d'expression
		String result = switch(value) {
			case 0, 1, 2, 3, 4 -> "Petit chiffre.";
			case 5, 6, 7, 8, 9 -> "Grand chiffre.";
			default -> "Ce n'est plus un chiffre, mais un nombre.";
		};
		// nb: chaque valeur proposée à la droite d'un opérateur -> doit être de type String, étant donné que la variable result est basée sur ce type.
		System.out.println(result);

		
		// Le mot clé yield
		String result1 = switch(value) {
			case 0, 1, 2, 3, 4 -> {
				double sqrt = Math.sqrt(value);
				yield "Petit chiffre dont la racine carré vaut " + sqrt;
			}
			case 5, 6, 7, 8, 9 -> {
				double square = value * value;
				yield "Grand chiffre dont le carré vaut " + square;
			}
			default -> "Ce n'est plus un chiffre, mais un nombre";
		};
		System.out.println(result1);
		
	}

}
