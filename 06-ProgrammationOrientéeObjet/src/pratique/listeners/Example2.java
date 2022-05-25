package pratique.listeners;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnClickMe = new JButton("Click me!");
	private JButton btnPushMe = new JButton("Push me!");
	public JButton btnActivateMe = new JButton("Activate me!");
	
	public Example2() {
		super("Implémentation d'interface");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
			
		btnClickMe.addActionListener(new BtnClickMeListener());;
		btnPushMe.addActionListener(new BtnPushMeListener());
		
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Example2();
	}

}
