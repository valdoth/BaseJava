import java.io.File;
import java.util.Date;

public class FormattedPrints {

	public static void main(String[] args) {
		
		int num = 25;
		int den = 11;
		System.out.println("[" + num + "/" + den + "]");
		System.out.printf("[%d/%d]\n", num, den);
	
		String message = String.format("[%d/%d]\n", num, den);
		System.out.print(message);
		
		// Type entier
		System.out.printf(">%5d<\n", num);
		System.out.printf(">%05d<\n", num);
		System.out.printf(">%d<\n", 1_000_000_000);
		System.out.printf(">%,d<\n", 1_000_000_000);
		
		System.out.printf(">%d %o %x\n", num, num, num);
		System.out.printf(">%05o<\n", num);
		
		// Types flottants
		System.out.printf("%f\n", Math.PI);
		System.out.printf("%.2f\n", Math.PI);
		System.out.printf("%5.2f\n", Math.PI);
		System.out.printf("%05.2f\n", Math.PI);
		System.out.printf("%,11.2f\n", 10000.26);
		
		System.out.printf("%e\n", Math.PI);	
		
		// Type character et String
		System.out.printf("%c - %s\n", 'z', "zero");
		System.out.printf(">%10s<\n", "toto");
		System.out.printf(">%-10s<\n", "toto");
		
		
		// Autres types
		System.out.printf("%b \n", true);
		System.out.printf("%h \n", new Date() ); // System.out.println(Integer.toHexString(arg.hashCode());
		System.out.println(new Date());
		System.out.printf("%tF  %tT \n", new Date(), new Date());
	
		
		// Exemple concret
		System.out.println("+-----------+---------------------+----------------------+");
		System.out.println("+ size (ko) +      Date time      +      File name       +");
		System.out.println("+-----------+---------------------+----------------------+");
		
		File [] files = new File(".").listFiles();
		for(File file: files) {
			long sizeKo = file.length() / 1024;
			Date lastModified = new Date(file.lastModified());
			String name = file.getName();
			
			System.out.printf("|%,10d | %tF %tT | %-20s |\n", sizeKo, lastModified, lastModified, name);
 		}
		
		System.out.println("+-----------+---------------------+----------------------+");
		
		
	}

}
