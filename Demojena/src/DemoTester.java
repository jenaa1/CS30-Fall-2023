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
		frame.setBounds(100, 100, 507, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.setForeground(Color.LIGHT_GRAY);
		fn.setText("First Name");
		fn.setBounds(41, 13, 120, 38);
		panel.add(fn);
		fn.setColumns(10);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Cresent", "Western", "Eastern"}));
		cb2.setBounds(222, 81, 114, 28);
		panel.add(cb2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "10", "11", "12"}));
		cb1.setBounds(41, 81, 120, 28);
		panel.add(cb1);
		
		JTextArea display = new JTextArea();
		display.setBounds(41, 134, 295, 117);
		panel.add(display);
		
		ln = new JTextField();
		ln.setForeground(Color.LIGHT_GRAY);
		ln.setText("Last name");
		ln.setColumns(10);
		ln.setBounds(222, 13, 120, 38);
		panel.add(ln);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fN = fn.getText();
				String lN = ln.getText();
				String grade = "";
				String school = "";
				
				if(cb1.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(cb1.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else if(cb1.getSelectedItem().equals("12"))
				{
					grade = "12";
				}
				
				
				if(cb1.getSelectedItem().equals("Cresent"))
				{
					school = "Cresent";
				}
				else if(cb1.getSelectedItem().equals("Western"))
				{
					school = "Western";
				}
				else if(cb1.getSelectedItem().equals("Eastern"))
				{
					school = "Eastern";
				}
				
				display.setText
				(
					fN + " " +
				    lN + " is in grade" + 
					grade + " and goes to" +
				    school + " high school"
						
				);
			}
		});
		btnNewButton.setBounds(365, 13, 116, 319);
		panel.add(btnNewButton);
		
		
		
		
	
	}
}
