import java.util.regex.Pattern;

public class RegExpPerf {
	
	private static Pattern emailPattern = Pattern.compile("^[\\\\w._-]+@[\\\\w._-]+\\\\.[a-z]{2,}$");
	private static Pattern datePattern = Pattern.compile("^(0[1-9]|[12][0-0]|3[01])/(0[1-9]|[1][012])/(19|20)?([0-9]{2})");
		  
	public static boolean isValidEmailOld(String email) {
		String regex = "^[\\\\w._-]+@[\\\\w._-]+\\\\.[a-z]{2,}$";
		return email.matches(regex);
	}
	
	public static boolean isValidDateOld(String date) {
		String regExp = "^(0[1-9]|[12][0-0]|3[01])/(0[1-9]|[1][012])/(19|20)?([0-9]{2})";
		return date.matches(regExp);
	}
	
	public static boolean isValidEmail(String email) {
		return emailPattern.matcher(email).matches();
	}
	
	public static boolean isValidDate(String date) {
		return datePattern.matcher(date).matches();
	}
	
	 
	public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		
		for(int i=0; i<1_000_000; i++) {
			//isValidEmailOld("martin@societe.com");
			isValidDateOld("30/10/1999");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Duration : " + (end - begin) + "ms");
		
		begin = System.currentTimeMillis();
		
		for(int i=0; i<1_000_000; i++) {
			//isValidEmail("martin@societe.com");
			isValidDate("30/10/1999");
		}
		
		end = System.currentTimeMillis();
		System.out.println("Duration : " + (end - begin) + "ms");
		
		
	}

}
