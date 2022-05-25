import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;

public class GenericContainer<COMPONENT extends Component> extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private COMPONENT myComponent;
	
	public GenericContainer(COMPONENT component) {
		super("Generic container");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPane = (JPanel) getContentPane();
		contentPane.add(component, BorderLayout.CENTER);
		
		this.pack();
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
	
	public COMPONENT getMyComponent() {
		return myComponent;
	}
	
	public static void main(String[] args) {
		//GenericContainer<JButton> frame = new GenericContainer<JButton>(new JButton("click me"));
		//JButton btn = frame.getMyComponent();
		
		GenericContainer<JTree> frame = new GenericContainer<JTree>(new JTree());
		JTree tree = frame.getMyComponent();
	}
	
}
