package pratique.interfaces;

import java.awt.Color;

public class GifImage implements Image {

	@SuppressWarnings("unused")
	private String filename;
	
	public GifImage(String filename) {
		this.filename = filename;
		load();
	}
	
	@Override
	public void load() {
		System.out.println("GIF image loaded");
	}

	@Override
	public void save() {
		System.out.println("GIF image saved");
	}

	@Override
	public Color[][] getBitMap() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
