import java.util.regex.Pattern;

public class Substitutions {

	public static void main(String[] args) {
		
		// Scrambling a personal number
		String myPhone = "01 02 03 04 05";
		System.out.println(myPhone.replaceAll("\\d", "x"));
		System.out.println(myPhone.replaceFirst("\\d\\d", "xx"));
		
		//System.out.println("test".replace('t', 'p'));
		//System.out.println("This is a sample test to use test replace".replace("test", "sample"));
		
		// Replace multiple separators by only one space
		String str = "This    is    \t    a string  with\tmultiple    \n    separator";
		System.out.println(str);
		System.out.println(str.replaceAll("\\s+", " "));
		
		
		Pattern separatorPattern = Pattern.compile("\\s+");
		System.out.println(separatorPattern.matcher(str).replaceAll(" "));
		
		
		// Avoid XSS (Cross Side Scripting) attcks on Java JEE server
		String requestParameter 
				= "Begin\n"
				+ "<Script type='text/javascript'>document.location.href='http://koor.fr'</Script>\n"
				+ "<script type='text/javascript'>\n"
				+ "    window.alert('ok');\n"
				+ "</script>\n"
				+ "End\n";
		Pattern xssPattern = Pattern.compile("<script[^>]*>(.*?)</script>", Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
		String safeParam = xssPattern.matcher(requestParameter).replaceAll(" ");
		safeParam = separatorPattern.matcher(safeParam).replaceAll(" ");
		System.out.println(safeParam);
		 
		
		// Bold some words in an HTML stream...
		String message = "This is an HTML content injected in a html tag";
		Pattern boldPattern = Pattern.compile("(HTML)", Pattern.CASE_INSENSITIVE);
		System.out.println(boldPattern.matcher(message).replaceAll("<b>$1</b>"));
		
		
	}

}
