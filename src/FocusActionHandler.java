import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FocusActionHandler implements FocusListener {
	
	JLabel label;
	JButton button;
	
	
	public FocusActionHandler(){
	}

	public FocusActionHandler(JLabel label){
		this.label = label;
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("EVENT!!!");
		label.setText(((JButton) e.getSource()).getText());
	}


	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
	}

}
