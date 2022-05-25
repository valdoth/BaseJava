package pratique.interfaces;

import java.awt.Color;
import java.util.Date;

public interface Image {

	// Est de type "public static final" implicitement
	// dans une interface
	String PNG_EXTENSION = ".png";
	String JPG_EXTENSION = ".jpg";
	String GIF_EXTENSION = ".gif";
	
	// si on définit une méthode et on ne met pas de mot clé devant
	// par défaut c'est public abstract 
	// depuis java8, une méthode d'interface n'est pas forcement abstract
	public abstract void load();
	void save();
	
	// notion de méthode par défaut
	public Color[][] getBitMap();
		
	
	public default void brighter() {
		Color [][] bitmap = getBitMap();
		if (bitmap != null) {
			for (int y=0; y<bitmap.length; y++) {
				Color [] row = bitmap[y];
				for (int x=0; x<row.length; x++) {
					row[x] = row[x].brighter();
				}
			}
		}
		log("image too bright");
	}
	
	public default void darker() {
		Color [][] bitmap = getBitMap();
		if (bitmap != null) {
			for (int y=0; y<bitmap.length; y++) {
				Color [] row = bitmap[y];
				for (int x=0; x<row.length; x++) {
					row[x] = row[x].darker();
				}
			}
		}
		log("image too dark");
	}
	
	public static Image createImage(String filename) {
		int dotPos = filename.lastIndexOf(".");
		if (dotPos == -1) {
			throw new RuntimeException("Bad image filename " + filename);
		}
		String extension = filename.substring(dotPos);
		switch (extension) {
			case PNG_EXTENSION:
				return new PngImage(filename);
			case GIF_EXTENSION:
				return new GifImage(filename);
			case JPG_EXTENSION:
				return new JpgImage(filename);
			default:
				throw new RuntimeException(extension + " format not actualy supported");
		}
	}
	
	private void log (String message) {
		System.out.println(new Date() + ": " + message);
	}
	
}
