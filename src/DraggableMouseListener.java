import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DraggableMouseListener implements MouseListener {
	private boolean mousePressed;

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		mousePressed = true;
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		mousePressed = false;
		// TODO Auto-generated method stub
	}

}
