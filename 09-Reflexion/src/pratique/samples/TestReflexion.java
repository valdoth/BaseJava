package pratique.samples;

import java.lang.reflect.Field;
import java.util.Date;

class Base {
	public int first;
	private int second;
}

public class TestReflexion extends Base {

	private int aNumericalValue;
	protected String aString;
	double aPrice;	// visibilité "package" par defaut
	public Date aDate;
	
	
	
	public static void main(String[] args) throws Exception {
		
		// Récupération des méta données à partid de la class
		Class<TestReflexion> metadata = TestReflexion.class;
		//System.out.println(metadata);
		
		Field [] fields =  metadata.getDeclaredFields();
		for (Field attribute : fields) {
			System.out.printf(
					"%s of t pe %s (isPrimitive: %b)\n",
					attribute.getName(),
					attribute.getType().getName(),
					attribute.getType().isPrimitive()
			);
		}
		
	}

}
