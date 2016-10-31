import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.Color;

public class DraggableComponents extends JFrame {

	private JPanel contentPane;
	private JTextField txtDragMeAround;
	/**
	 * Create the frame.
	 */
	public DraggableComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Text Box Position");
		lblNewLabel_1.setBounds(168, 236, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDragMeAround = new JTextField();
		txtDragMeAround.setBackground(Color.GREEN);
		txtDragMeAround.setText("Drag me around");
		txtDragMeAround.setBounds(10, 98, 100, 25);
		contentPane.add(txtDragMeAround);
		txtDragMeAround.setColumns(10);
	}
}
