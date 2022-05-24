
public class TestSwitch {

	public static void main(String[] args) {
		
		int value = (int) (Math.random()*10);
		
		switch (value) {
			case 0:
				System.out.println("Zéro");
				break;
			case 1:
				System.out.println("Un");
				break;
			case 2:
				System.out.println("Deux");
				break;
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("3-6");
				break;
			default:
				System.out.println("Autre");
				break;
		}
		
	}

}
