import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TempInput extends JPanel {
	
	public TempInput(){
		Dimension size = getPreferredSize();
		size.height = 200;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Convert Celcius to Farenheight"));
		
		JLabel tempLabel = new JLabel("Temperature in C");
		JLabel finalTempLabel = new JLabel("Temperature in F");
		final JTextField tempInput = new JTextField(10);
		final JTextArea tempOutput = new JTextArea(1, 10);
		JButton submit = new JButton("Convert");
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		// First Column
		gc.anchor = GridBagConstraints.LINE_START;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		add(tempLabel, gc);
		
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 1;
		gc.gridy = 0;
		
		add(tempInput, gc);
		
		// Second Column
		gc.anchor = GridBagConstraints.LINE_START;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
				
		gc.gridx = 0;
		gc.gridy = 1;
				
		add(finalTempLabel, gc);
				
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 1;
		gc.gridy = 1;
				
		add(tempOutput, gc);
		
		// Second Column
		
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridx = 0;
		gc.gridy = 2;
		
		add(submit, gc);
		
	
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				tempOutput.setText("");
				String convertedValue = "";
				int tempInCelcius = Integer.parseInt( tempInput.getText() );
				
				int tempInF = ((tempInCelcius * 9) /5 ) + 32;
				convertedValue = tempInF + "";
				
				tempOutput.append(convertedValue);
				
			}
			
		});
	}

}












