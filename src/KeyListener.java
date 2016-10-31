import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class KeyListener extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private String userInput;
	/**
	 * Create the frame.
	 */
	public KeyListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		File keyLog = new File("keyLog.txt");
		try{
			FileWriter outputStream = new FileWriter("keyLog.txt");
			
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent m) {
					System.out.println(m.getKeyChar());
					userInput += m.getKeyChar();
					try {
						outputStream.append(m.getKeyChar());
						outputStream.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			}
			);
		}catch(IOException e){
			System.out.println("IO exception");
			e.printStackTrace();
		}
		
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
	}

}
