import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;

public class DemoTester {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoTester window = new DemoTester();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoTester() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.setForeground(Color.LIGHT_GRAY);
		fn.setText("First Name");
		fn.setBounds(48, 13, 120, 38);
		panel.add(fn);
		fn.setColumns(10);
		
		JTextArea display = new JTextArea();
		display.setBounds(48, 148, 250, 82);
		panel.add(display);
		
		ln = new JTextField();
		ln.setForeground(Color.LIGHT_GRAY);
		ln.setText("Last name");
		ln.setColumns(10);
		ln.setBounds(178, 13, 120, 38);
		panel.add(ln);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fN = fn.getText();
				String lN = ln.getText();
				
				display.setText
				(
					fN + " " +
				    lN 
						
				);
			}
		});
		btnNewButton.setBounds(329, 13, 95, 237);
		panel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "10", "11", "12"}));
		comboBox.setBounds(48, 81, 120, 28);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Cresent", "Western", "Eastern"}));
		comboBox_1.setBounds(178, 81, 114, 28);
		panel.add(comboBox_1);
		
	
	}
}
