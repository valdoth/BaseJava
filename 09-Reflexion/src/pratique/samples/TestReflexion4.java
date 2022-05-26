package pratique.samples;

import java.lang.reflect.Method;
import java.util.Date;

public class TestReflexion4 {
	
	public void publicMethod() {
		
	}
	
	private void privateMethod() {
		
	}
	
	public static void publicStaticMethod() {
		
	}
	
	private static void privateStaticMethod() {
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		// Récupération des méta données à partid de la class
		Class<TestReflexion4> metadata = TestReflexion4.class;
		
		// On récupère les méthodes déclarées dans le type coutant;
		// Method [] methods = metadata.getDeclaredMethods();
		Method [] methods = metadata.getMethods();
	
		// On affiche des informations sur les méthodes de la classe
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		// 24:46
		
	}

}
