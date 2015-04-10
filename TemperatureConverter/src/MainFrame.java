import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;


public class MainFrame extends JFrame {
	public MainFrame(String title){
		super(title);
		
		// Set Layout Manager
		setLayout(new BorderLayout() );
		
		// Create Swing Components
		TempInput temp_input = new TempInput();
		
		
		
		// Add Swing Components to panel
		Container c = getContentPane();
		c.add(temp_input, BorderLayout.NORTH);
		
		
	}
}
