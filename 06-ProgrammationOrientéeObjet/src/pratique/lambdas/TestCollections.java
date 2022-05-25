package pratique.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		languages.add("Visual basic");
		languages.add("C");
		languages.add("Python");
		languages.add("Java");
		languages.add("C++");
		
		System.out.println(languages);
		
		for (String string: languages) {
			System.out.println(string);
		}
		
		System.out.println();
		
		languages.forEach(System.out::println);
		
		System.out.println();
		

		Collections.sort(languages, new Comparator<String>() {

			@Override
			public int compare(String l1, String l2) {
				return l1.compareToIgnoreCase(l2);
			}
		}); 
		System.out.println(languages);
		System.out.println();
		
		List<String> languagesProg = new ArrayList<String>();
		languagesProg.add("Visual basic");
		languagesProg.add("C");
		languagesProg.add("Python");
		languagesProg.add("Java");
		languagesProg.add("C++");
		
		System.out.println(languagesProg);
		languagesProg.sort((l1, l2) -> l1.compareToIgnoreCase(l2)) ;
		System.out.println(languagesProg);
	
		
		List<String> languagesP = new ArrayList<String>();
		languagesP.add("Visual basic");
		languagesP.add("C");
		languagesP.add("Python");
		languagesP.add("Java");
		languagesP.add("C++");
		
		System.out.println(languagesP);
		languages.stream().filter((s) -> s.length() <= 4).forEach(System.out::println);;
		
	
	}
	
}
