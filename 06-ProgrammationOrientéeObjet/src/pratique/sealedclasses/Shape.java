package pratique.sealedclasses;

// Pour définir une classe scéllée, on utilise le mot clé contextel
// "sealed". On compléte la définition via le mot clé contextuel
// "permit" pour indiquer quels sont les types autorisés à dériver de la classe scellée

public sealed class Shape permits Circle, Square  {
	
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	
	
	// imaginer d'autres attributs et méthodes
	
}
