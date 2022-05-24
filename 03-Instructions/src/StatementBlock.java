
public class StatementBlock {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		
		{
			int b = 20;
			a++;
			System.out.println(a + " - " + b);
		}
		
		System.out.println(a);
		
		
	}

}
