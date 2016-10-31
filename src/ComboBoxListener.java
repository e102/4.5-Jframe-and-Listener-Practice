import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComboBoxListener extends JFrame {

	private JPanel contentPane;
	private String personName;

	
	public ComboBoxListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JLabel label = new JLabel("");
		contentPane.add(label, BorderLayout.EAST);
		
		
		String[] people = {"bob", "jane", "Zack", "Mary"};
		JComboBox comboBox = new JComboBox(people);
		comboBox.addActionListener(new ComboBoxHandler(label) {
			public void actionPerformed(ActionEvent e, JLabel label) {
				System.out.println("hello");
			}
		});
		contentPane.add(comboBox, BorderLayout.WEST);
		

	}

}
