import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class IntroductionGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> collection = new ArrayList<String>();
		collection.add("toto");
		collection.add("titi");
		collection.add("tutu");
		collection.add("tata");
		
		for (String object : collection) {
			System.out.println(object.toUpperCase());
		}
		
		ArrayList<Date> dates = new ArrayList<Date>();
		dates.add(new Date());
		dates.add(new Date());
		for (Date date : dates) {
			System.out.println(date);
		}
		
		HashMap<String, Person> agenda = new HashMap<String, Person>();
		agenda.put("007", new Person("James", "Bond", "bon@m16.uk"));
		agenda.put("000", new Person("Johnny", "English", "zero@mi6.uk"));
	
		Person p = agenda.get("007");
		System.out.println(p);
		
		
	}

}


