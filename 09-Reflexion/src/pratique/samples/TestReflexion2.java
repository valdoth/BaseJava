package pratique.samples;

public class TestReflexion2 {

	public static void main(String[] args) throws Exception {
		
		// Récupération des méta données à partid de la class
		Class<TestReflexion2> metadata = TestReflexion2.class;
		System.out.println(metadata);
		
		// Récupération des méta données à partir d'une instance
		TestReflexion2 object = new TestReflexion2();
		Class<? extends TestReflexion2> metadata2 = object.getClass();
		System.out.println(metadata2);
		
		// Dans les deux cas, nous avons les même exception
		System.out.println(metadata == metadata2);
		
		
		
	}

}
