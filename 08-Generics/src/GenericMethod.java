import java.awt.Component;
import java.lang.reflect.Constructor;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class GenericMethod {
	
	public static Component [] components = {
			new JButton("Click me!"),
			new JCheckBox("Check me!"),
			new JTextField("Edit me!")
	};
	
	public static <TYPE> TYPE find(Class<TYPE> metadata, int primaryKey) throws Exception {
		Constructor<TYPE> construct = metadata.getDeclaredConstructor();
		TYPE instance = construct.newInstance();
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public static <TYPE> TYPE findViewById(int i) {
		return ((TYPE) components[i]);
	}

	public static void main(String[] args) throws Exception {
		
		Date now = find(Date.class, 1);
		System.out.println(now);
		
		JButton btnTest = find(JButton.class, 1);
		System.out.println(btnTest);
		
		JCheckBox chkCheckMe = findViewById(1);
		System.out.println(chkCheckMe);
		
	}

}
