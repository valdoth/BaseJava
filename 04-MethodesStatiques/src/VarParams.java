
public class VarParams {
	
//	public static int add(int [] values) {
//		int accumulator = 0;
//		for (int val : values) {
//			accumulator += val;
//		}
//		return accumulator;
//	}
	
	public static int add(int ... values) {
		int accumulator = 0;
		for (int val : values) {
			accumulator += val;
		}
		return accumulator;
	}
	

	public static void main(String[] args) {
		
		int [] values = { 10, 20, 30, 40, 50 };
		System.out.println(add(values));
		System.out.println(add());
		System.out.println(add(10));
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		
		
		System.out.printf("[%d/%d]\n", 3, 7);
		System.out.printf("[%d, %d, %d]\n", 3, 7, 9);
		
	}

}
