
public class TestContinue {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("----------------------------------------");
		
		int i = 0;
		while(i < 10) {
			if(i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Bye bye");
		
	}

}
