package pratique.records;

import java.util.Objects;

public class PointOld {
	
	/*
	 * Deux attributs finaux ne pouvant plus être
	 * modifiés après la construction de l'intance
	 */
	private final double x;
	private final double y;
	
	/*
	 * Un constructeur de classe avec une délegation
	 * à un second constructor acceptant deux flottants
	 */
	public PointOld() {
		this(0, 0);
	}
	
	/*
	 * Un second constructeur permettant de fixer l'état
	 * initial des deux attributs de la classe.
	 */
	public PointOld(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 * Deux getters pour l'accés à l'état de nos points.
	 * Les setters ne sont pas disponibles afin de garantir 
	 * l'aspect imutable (readonly) de nos objets.
	 */
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	/*
	 * Cette méthode est utile si nous souhaitons utiliser des instances
	 * de points dans une table associative (type Hashable ou HashMap).
	 * Elle permettra de calculer le "hashcode" (en gros, la position 
	 * dans la collection) d'un point donné.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	/*
	 * Cette méthode permettra de comparer deux instances Java et 
	 * d'indiquer si elles sont identiques ou non.
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		} else if (object instanceof PointOld) {
			PointOld other = (PointOld) object;
			return x == other.x && y == other.y;
		} else {
			return false;
		}
	}
	
	/*
	 * Pour calculer la chaîne de caractère de représentation d'un point.
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" +y + "]";
	}
 
}
