package pratique.interfaces;

public class Start {

	public static void main(String[] args) {
		
		System.out.println(Image.PNG_EXTENSION);
		
		Image image = Image.createImage("toto.png");
		
		image.darker();
		
	}
 
}
