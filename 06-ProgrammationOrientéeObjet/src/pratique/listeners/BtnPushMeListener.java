package pratique.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BtnPushMeListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("Push me !!! ");
		JButton btn = (JButton)event.getSource();
		Example2 frame = (Example2) btn.getTopLevelAncestor();
		frame.setTitle("click");
		
		frame.btnActivateMe.setText("Hello");
		frame.btnActivateMe.setForeground(Color.red);
	}

}
