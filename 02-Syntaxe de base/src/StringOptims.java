public class StringOptims {

	private static final int LOOP_COUNT = 10_000_000;
	
	public static void withoutOptims() {
		long begin = System.currentTimeMillis();
		
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03a0';
		for (int i=0; i<LOOP_COUNT; i++) {
			String fullMessage = "Begin - ";
			fullMessage += part1;
			fullMessage += " - ";
			fullMessage += part2;
			fullMessage += " - ";
			fullMessage += part3;
			fullMessage += " - ";
			fullMessage += part4;
			fullMessage += " - End";
			System.out.println(fullMessage);
		}
		long end = System.currentTimeMillis();
		System.out.println("Duration: " + (end - begin) + "ms");
	}
	
	
	public static void optimsThreadSafe() {
		long begin = System.currentTimeMillis();
		
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03a0';
		for (int i=0; i<LOOP_COUNT; i++) {
			StringBuffer buffer = new StringBuffer("Begin - ");
			buffer.append(part1);
			buffer.append(" - ");
			buffer.append(part2);
			buffer.append(" - ");
			buffer.append(part3);
			buffer.append(" - ");
			buffer.append(part4);
			buffer.append(" - End");
			//System.out.println(buffer);
			String fullMessage = buffer.toString();
			System.out.println(fullMessage);
		}
		long end = System.currentTimeMillis();
		System.out.println("Duration: " + (end - begin) + "ms"); 
	}
	
	
	public static void optimsThreadUnsafe() {
long begin = System.currentTimeMillis();
		
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03a0';
		for (int i=0; i<LOOP_COUNT; i++) {
			StringBuilder builder = new StringBuilder("Begin - ");
			builder.append(part1);
			builder.append(" - ");
			builder.append(part2);
			builder.append(" - ");
			builder.append(part3);
			builder.append(" - ");
			builder.append(part4);
			builder.append(" - End");
			//System.out.println(builder));
			String fullMessage = builder.toString();
			System.out.println(fullMessage);
		}
		long end = System.currentTimeMillis();
		System.out.println("Duration: " + (end - begin) + "ms");
	}
	
	
	public static void main(String[] args) {
		
		withoutOptims();
		optimsThreadSafe();
		optimsThreadUnsafe();
		
		// ATTENTION: les concaténations en ligne sont automatiquements optimisées
		// Vous pouvez le vérifier via l'outil javap (javap -c Classname)
		String part1 = "part1";
		double part2 = 3.141592654;
		int part3 = 123;
		char part4 = '\u03a0';
		
		String fullMessage = "Begin - " + part1 + " - " + part2 + " - " + part3 + " - " + part4 + " - End";
		System.out.println(fullMessage);
		
	}

}
