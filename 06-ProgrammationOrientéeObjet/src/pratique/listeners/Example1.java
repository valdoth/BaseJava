package pratique.listeners;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnClickMe = new JButton("Click me!");
	private JButton btnPushMe = new JButton("Push me!");
	private JButton btnActivateMe = new JButton("Activate me!");
	
	public Example1() {
		super("Implémentation d'interface");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(btnClickMe);
		contentPane.add(btnPushMe);
		contentPane.add(btnActivateMe);
		
		btnClickMe.addActionListener(this);
		btnPushMe.addActionListener(this);
		btnActivateMe.addActionListener(this);
		
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		//System.out.println("Button \"" + ((JButton)event.getSource()).getText() +"\" cliked");
		if (event.getSource() == btnClickMe) {
			 System.out.println("Bouton click me cliqué !!!");
		} else if (event.getSource() == btnPushMe) {
			this.setTitle("click");
		} else if (event.getSource() == btnActivateMe) {
			
		}
	}
	
	public static void main(String[] args) {
		new Example1();
	}

}
