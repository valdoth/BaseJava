
public class TestFor {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("Bye bye\n");
		
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
	 	
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
 		}
		
	}

}
