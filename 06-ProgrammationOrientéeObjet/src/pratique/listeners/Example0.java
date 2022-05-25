package pratique.listeners;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example0 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnClickMe = new JButton("Click me!");
	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnActivateMe = new JButton("Activate me!");
	
	public Example0() {
		super("Implémentation d'interface");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
			
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Example0();
	}

}
