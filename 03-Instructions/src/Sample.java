
public class Sample {

	public static void main(String[] args) {
		
		int value = (int) (Math.random() * 11);
		
		switch(value) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Petit chiffre");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("Grand chiffre");
				break;
			default:
				System.out.println("Ce n'est plus un chiffre, mais un nombre");
				break;
		}
		
	}

}
