package pratique.listeners;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example3 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnClickMe = new JButton("Click me!");
	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnActivateMe = new JButton("Activate me!");
	
	private int demo = 10;
	
	public Example3() {
		super("Implémentation d'interface");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
			
		btnClickMe.addActionListener(new BtnClickMeListenerInner());
		
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Example3();
	}

	private class BtnClickMeListenerInner implements ActionListener {

		private int demo = 2000;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(demo);
			System.out.println(this.demo);
			System.out.println(Example3.this.demo);
			setTitle("clicked inner");
			btnPushMe.setText("updated");
		}
		
	}
	
}
