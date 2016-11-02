import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DraggableMotionMover implements MouseMotionListener {

	JPanel contents;
	
	DraggableMotionMover(JPanel contents){
		this.contents = contents;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		((Component) e.getSource()).setLocation(contents.getMousePosition());	//gets position from frame
	}


	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
