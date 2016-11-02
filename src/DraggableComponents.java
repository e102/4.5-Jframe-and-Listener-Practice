import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class DraggableComponents extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public DraggableComponents() {
		//setting up content pane
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//setting up text boxes, lebels etc...
		JLabel textBoxPos = new JLabel("Text Box Position: ");
		textBoxPos.setBounds(34, 236, 226, 14);
		contentPane.add(textBoxPos);
		
		JLabel lblDragMe = new JLabel("Drag me!");
		lblDragMe.setBounds(34, 110, 66, 14);
		contentPane.add(lblDragMe);
		
		JLabel lblMousePosition = new JLabel("Mouse Position: ");
		lblMousePosition.setBounds(34, 222, 226, 14);
		contentPane.add(lblMousePosition);
		
		JButton btnDragMeTooo = new JButton("Drag me tooo!");
		btnDragMeTooo.setBounds(181, 79, 89, 23);
		contentPane.add(btnDragMeTooo);
		
		JLabel lblButtonPosition = new JLabel("Button Position: ");
		lblButtonPosition.setBounds(34, 211, 315, 14);
		contentPane.add(lblButtonPosition);
		
		DraggableMotionListener frank = new DraggableMotionListener(textBoxPos, lblMousePosition, lblDragMe, lblButtonPosition, btnDragMeTooo);
		contentPane.addMouseMotionListener(frank);
		
		lblDragMe.addMouseMotionListener(new DraggableMotionMover(contentPane));
		btnDragMeTooo.addMouseMotionListener(new DraggableMotionMover(contentPane));
		

	}
}
