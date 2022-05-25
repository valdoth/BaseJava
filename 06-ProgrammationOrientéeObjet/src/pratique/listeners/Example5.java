package pratique.listeners;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example5 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnClickMe = new JButton("Click me!");
	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnActivateMe = new JButton("Activate me!");
	
	public Example5() {
		super("Implémentation d'interface");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		/*btnClickMe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ok");
			}
		});*/
		
		
		// Ici il y a une inférence de type pour e par le compilateur en analysant la seule methode de type abstraite porté par notre interface
		
		// Les différentes type ou on peut écrire une lambdas
		//btnClickMe.addActionListener( (e) -> System.out.println("Ok 1 " + e.getSource()) );
		//btnClickMe.addActionListener( e -> System.out.println("Ok 2 " + e.getSource()) );
		//btnClickMe.addActionListener( (ActionEvent e) -> System.out.println("Ok 3 " + e.getSource()) );
		/*btnClickMe.addActionListener( (e) -> {
			System.out.println("Ok 4 " + e.getSource());
			System.out.println("test");
			return;
		});*/
		/*btnClickMe.addActionListener((e) -> {
			btnClickMeListener(e);
		});*/
		
		
		// reference sur méthode
		btnClickMe.addActionListener(this::btnClickMeListener);
		
		//<>
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
	
	private void btnClickMeListener(ActionEvent e) {
		System.out.println("Ok 5");
	}
	
	public static void main(String[] args) {
		new Example5();
	}

}
