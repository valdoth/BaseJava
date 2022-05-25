package pratique.interfaces;

import java.awt.Color;

public class PngImage implements Image {

	@SuppressWarnings("unused")
	private String filename;
	
	public PngImage(String filename) {
		this.filename = filename;
		load();
	}
	
	@Override
	public void load() {
		System.out.println("PNG image loaded");
	}

	@Override
	public void save() {
		System.out.println("PNG image saved");
	}

	@Override
	public Color[][] getBitMap() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
