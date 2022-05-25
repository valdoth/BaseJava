package pratique.interfaces;

import java.awt.Color;

public class JpgImage implements Image {

	@SuppressWarnings("unused")
	private String filename;
	
	public JpgImage(String filename) {
		this.filename = filename;
		load();
	}
	
	@Override
	public void load() {
		System.out.println("JPG image loaded");
	}

	@Override
	public void save() {
		System.out.println("JPG image saved");
	}

	@Override
	public Color[][] getBitMap() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
