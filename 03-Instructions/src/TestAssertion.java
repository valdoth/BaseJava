
public class TestAssertion {

	public static long fact(long value) {
		//if (value < 0) {
		//	throw new IllegalArgumentException("value must be positive");
		//}
		assert value >= 0 : "value must be positive";
		if(value <= 1) {
			return 1;
		}
		return value * fact(value - 1);
	}
	
	public static void main(String[] args) {
		
		//assert args.length == 2;
		//assert args.length == 2: "Two parameters are require";
		
		long begin = System.currentTimeMillis();
		
		//System.out.println("15! = " + fact(15));
		for(int i=0; i<1_000_000_000; i++) {
			fact(6);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Duration : " + (end - begin) + "ms");
		
	}

}
