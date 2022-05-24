
public class IncDec {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		int part1 = 10;
		int part2 = 20;
		int result = part1++ + part2++;
		System.out.println(result);
		System.out.println(part1 + " " + part2);
		result = part1 + part2;
		System.out.println(result);
		result = ++part1 + ++part2;
		System.out.println(result);
		
	}

}
