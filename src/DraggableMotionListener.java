import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class DraggableMotionListener implements MouseMotionListener {
	private JLabel textBoxPos;
	private JLabel lblMousePosition;
	private JLabel lblDragMe;
	
	DraggableMotionListener(JLabel textBoxPos, JLabel lblMousePosition, JLabel lblDragMe){
		this.textBoxPos = textBoxPos;
		this.lblMousePosition = lblMousePosition;
		this.lblDragMe = lblDragMe;
	}


	@Override
	public void mouseDragged(MouseEvent e) {
//		((Component) e.getSource()).setLocation(e.getX(),e.getY());
//		lblDragMe.setLocation(e.getX(),e.getY());
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		lblMousePosition.setText("Mouse Potition: X = " + e.getX() + " Y = " + e.getY());
		textBoxPos.setText("Draggable box position = X:" + lblDragMe.getX() + " Y:" + lblDragMe.getY());
	}
}
