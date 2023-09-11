import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemojenaGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemojenaGUI window = new DemojenaGUI();
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
	public DemojenaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 352, 231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("pink");
		lblNewLabel.setBounds(57, 92, 208, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JButton jena = new JButton("jena");
		jena.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				lblNewLabel.setText("Hello, Computer Science Students!!");
			
				
			}
			{;
		jena.setBounds(85, 0, 180, 31);
		frame.getContentPane().add(jena);
		

			}});
}}