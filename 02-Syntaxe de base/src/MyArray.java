import java.util.ArrayList;

public class MyArray {

	public static void main(String[] args) {
		
		int [] firstArray = new int[5];
		firstArray[0] = 10;
		firstArray[1] = 20;
		firstArray[2] = 30;
		firstArray[3] = 40;
		firstArray[4] = 50; 
		for(int value: firstArray) {
			System.out.println(value);
		}
		System.out.println(firstArray);
		
		int [] secondArray = { 100, 200, 300, 400, 500 };
		for(int value: secondArray) {
			System.out.println(value);
		}
		
		double [] thirdArray = { 5.1, 6.2, 7.5, 9.1 };
		for (double value : thirdArray) {
			System.out.println(value);
		}
		
		boolean [] fourthArray = new boolean[5];
		fourthArray[1] = true;
		for (boolean value : fourthArray) {
			System.out.println(value);
		}
		
		String [] values = { "azerty", "qwerty", "autre" };
		for (String string : values) {
			System.out.println(string.toUpperCase());
		}
		
		System.out.println(args.length);
		for (String string : args) {
			System.out.println(string);
		}
		
		
		ArrayList<String> coll = new ArrayList<>(); 
		coll.add("azerty");
		coll.add("qwerty");
		System.out.println(coll.size());
		for (String string : coll) {
			System.out.println(string);
		}
		
	}

}
