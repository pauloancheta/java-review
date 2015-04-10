import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MainWindow {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater( new Runnable(){
			public void run(){
				JFrame frame = new MainFrame("Temperature Converter");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(300, 300);
			}
		});
	}

}
