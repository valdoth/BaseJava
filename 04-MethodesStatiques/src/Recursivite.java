
public class Recursivite {

	public static long factIt(long value) {
		long accumulator = 1;
		
		for(int i=2; i<=value; i++) {
			accumulator *= i;
		}
		return accumulator;
	}
	
	public static long factRec(long value) {
		if(value == 0 || value == 1) {
			return 1;
		}
		return factRec(value - 1) * value;
	}
	
	public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		
		for (int i=0; i<10_000_000; i++) {
			factIt(100);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Duration : " + (end - begin) + "ms");
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i<10_000_000; i++) {
			factRec(100);
		}
		
		end = System.currentTimeMillis();
		System.out.println("Duration : " + (end - begin) + "ms");
		
		
		System.out.println("0! == " + factIt(0));
		System.out.println("1! == " + factIt(1));
		System.out.println("5! == " + factIt(5));
		System.out.println("6! == " + factIt(6));
		
		System.out.println("------------------------");
		
		System.out.println("0! == " + factRec(0));
		System.out.println("1! == " + factRec(1));
		System.out.println("5! == " + factRec(5));
		System.out.println("6! == " + factRec(6));
		
	}

}
