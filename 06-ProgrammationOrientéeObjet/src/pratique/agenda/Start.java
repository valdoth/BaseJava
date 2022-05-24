package pratique.agenda;

public class Start {

	public static void main(String[] args) {
		
		Person james = new Person("James", "Bond", "007@mi6.uk");
		System.out.println(james);
		
		
		Employee emp = new Employee();
		System.err.println(emp);
		
		Employee empl = new Employee("Jason", "Burne", "jb@cia.com", 10_000);
		System.out.println(empl);
		
		Client whiteHouse = new Client("White", "House", "whitehouse@gov.com", 1);
		System.out.println(whiteHouse);
		
		System.out.println("------------------------------------------");
		
		
		Person [] persons = new Person[3];
		
		persons[0] = new Person();
		persons[1] = new Employee("Jason", "Burne", "jb@cia.com", 10_000);
		persons[2] = new Client("White", "House", "whitehouse@gov.com", 1);
		
		// Je traite tout le monde
		for (Person person: persons) {
			System.out.println(person);
		}
		
		System.out.println("-------------------------------------------");
		
		// Afficher que les employee
		for (Person person: persons) {
			if (person instanceof Employee) {
				System.out.println(person);
			}
		}
		
	}

}
