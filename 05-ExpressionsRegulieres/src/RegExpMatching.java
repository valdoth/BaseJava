
public class RegExpMatching {

	public static boolean isValidEmail(String email) {
		//String regex = "^.+@.+\\..+$";
		//String regex = "^[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[a-z]{2,}$";
		String regex = "^[\\w._-]+@[\\w._-]+\\.[a-z]{2,}$";
		return email.matches(regex);
	}
	
	public static boolean isValidDate(String date) {
		// jj/mm/aaaa ou //jj//mm//aa
		//String regExp = "^\\d\\d/\\d\\d/\\d\\d(\\d\\d)?$";
		//String regExp = "^[0-9]{2}/[0-9]{2}/[0-9]{2}([0-9]{2})?";
		String regExp = "^(0[1-9]|[12][0-0]|3[01])/(0[1-9]|[1][012])/(19|20)?([0-9]{2})";
		return date.matches(regExp);
	}
	
	public static void main(String[] args) {
		
		System.out.println(isValidEmail("martin.mike_06@infini-software.com"));
		System.out.println(isValidEmail("martin@societe.com"));
		System.out.println(isValidEmail("martin@societe.fr"));
		System.out.println(isValidEmail("martin.societe.com"));
		System.out.println(isValidEmail("martin@societe"));
		System.out.println(isValidEmail("@@@.@"));
	
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		System.out.println(isValidDate("30/05/2017"));
		System.out.println(isValidDate("30/05/17"));
		System.out.println(isValidDate("01/10/1999"));
		System.out.println(isValidDate("36/55/9999"));
		System.out.println(isValidDate("00/10/1999"));
		System.out.println(isValidDate("26/13/1960"));
		System.out.println(isValidDate("3/05/17"));
		System.out.println(isValidDate("martin@societe.com"));
		System.out.println(isValidDate("jj/mm/aaaa"));
		System.out.println(isValidDate("30/05"));
		
	}

}