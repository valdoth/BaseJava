import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractions {

	public static void main(String[] args) {

		// Extract data with String.split
		String [] dates = { "20-08-2010", "18/17/2017" };
		for(String date: dates) {
			String [] dateParts = date.split("[/-]");
			System.out.printf("%s - %s - %s \n", dateParts[0], dateParts[1], dateParts[2]);
		}
		System.out.println("----------------------------------------------");
		
		// Extract data with Matcher class - Caution: regulat expression are gredy
		String htmlContent = "<html><head><title>Titre</title></head><body><h1>Titre visuel</h1></body></html>";
		String regExp = "<(.+?)>";
		
		Pattern htmlPattern = Pattern.compile(regExp, Pattern.DOTALL);
		Matcher htmlMatcher = htmlPattern.matcher(htmlContent);
		while(htmlMatcher.find()) {
			System.out.println("Whole matched expression : " + htmlMatcher.group(0));
			System.err.println("Tag " + htmlMatcher.group(1));
		}
		
		System.out.println("----------------------------------------------");
		
		
		// --- IP address extraction ---
        String result = execWithOutput( "ifconfig" );
        
        String interfaceName = "wlp3s0";
        regExp = interfaceName + ":.+?inet (\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\s+netmask";
        Pattern pattern = Pattern.compile( regExp, Pattern.DOTALL );

        Matcher matcher = pattern.matcher( result );
        if ( matcher.find() ) {
            System.out.println( "Whole matched expression: " + matcher.group( 0 ) );
            System.out.println( "IP address: " + matcher.group( 1 ) );
        }
		
	}

	 public static String execWithOutput( String programName ) {
	        ProcessBuilder processBuilder = new ProcessBuilder( programName );
	        processBuilder.redirectErrorStream(true);

	        try {
	            Process process = processBuilder.start();  
	            try ( BufferedReader stream = new BufferedReader( new InputStreamReader( process.getInputStream() ) ) ) {
	                StringBuilder builder = new StringBuilder();
	                while ( true ) {
	                    String line = stream.readLine();
	                    if ( line == null ) break;
	                    builder.append( line ).append( "\n" );
	                }
	                process.waitFor();
	                return builder.toString();
	            }
	        } catch( Exception exception ) {
	            throw new RuntimeException( "Cannot launch process " + programName );
	        }
	    }
	
}
