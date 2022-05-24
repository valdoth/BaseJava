
public class TestIf {

	public static void main(String[] args) {
		
		int value = (int) (Math.random()*10);	// 0 <= value <= 9
		
		if (value > 7) {
		 	System.out.println(value + " - BIG");
		} else if (value > 3) { 
			System.out.println(value + " - MEDIUM");
		} else {
			System.out.println(value + " - SMALL");
		}
		System.out.println("SUITE");
		
		
	}

}
