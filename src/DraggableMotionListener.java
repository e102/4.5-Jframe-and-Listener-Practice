import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class DraggableMotionListener implements MouseMotionListener {
	private JLabel textBoxPos;
	private JLabel lblMousePosition;
	private JLabel lblDragMe;
	private JLabel lblButtonPosition;
	private JButton draggableButton;
	
	DraggableMotionListener(JLabel textBoxPos, JLabel lblMousePosition, JLabel lblDragMe, JLabel lblButtonPosition, JButton draggableButton){
		this.textBoxPos = textBoxPos;
		this.lblMousePosition = lblMousePosition;
		this.lblDragMe = lblDragMe;
		this.lblButtonPosition = lblButtonPosition;
		this.draggableButton = draggableButton;
	}


	@Override
	public void mouseDragged(MouseEvent e) {
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		lblMousePosition.setText("Mouse Potition: X = " + e.getX() + " Y = " + e.getY());
		textBoxPos.setText("Draggable box position = X:" + lblDragMe.getX() + " Y:" + lblDragMe.getY());
		lblButtonPosition.setText("Draggable button position = X:" + draggableButton.getX() + " Y:" + draggableButton.getY());
	}
}
