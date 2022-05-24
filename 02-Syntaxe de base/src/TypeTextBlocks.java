
public class TypeTextBlocks {

	public static void main(String[] args) {
		
		// Derrière ce nom de "Text Blocks se cache, en verité, un concept très simple
		// des chaînes de caractères multi-lignes. Une chaîne "TextBlock" s'introduit 
		// via trois doubles guillemets et se termine par la même séquence de caractères.
		
		String welcome = """
				My Super App - Copyright test.mg
				Usage: [Options] SuperApp param1 param2
					-h		display this help
					-x		imagine a parameter
				""";
		System.out.println(welcome);
		
	}

}
