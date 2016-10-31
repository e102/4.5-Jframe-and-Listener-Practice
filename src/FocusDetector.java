import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusDetector extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FocusDetector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JLabel label = new JLabel("");
		contentPane.add(label, BorderLayout.CENTER);
		
		FocusActionHandler bob = new FocusActionHandler(label);
		
		JButton btnButton = new JButton("Button Left");
		btnButton.addFocusListener(bob);
		contentPane.add(btnButton, BorderLayout.WEST);
		
		JButton btnButton_1 = new JButton("Button Right");
		btnButton_1.addFocusListener(bob);
		contentPane.add(btnButton_1, BorderLayout.EAST);
		
		
		JButton btnButtonTop = new JButton("Button Top");
		btnButtonTop.addFocusListener(bob);
		contentPane.add(btnButtonTop, BorderLayout.NORTH);
		
		JButton btnButtonBotton = new JButton("Button Botton");
		btnButtonBotton.addFocusListener(bob);
		contentPane.add(btnButtonBotton, BorderLayout.SOUTH);
		

	}

}
