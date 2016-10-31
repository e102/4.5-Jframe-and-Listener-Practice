import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ComboBoxHandler implements ActionListener  {
	private String personName;
	private JLabel label;
	
	public ComboBoxHandler(JLabel label){
		this.label=label;
	}
	
	public void actionPerformed(ActionEvent e) {
		JComboBox b = (JComboBox) e.getSource();
		personName = (String) b.getSelectedItem();
		label.setText(personName);
	}

}
