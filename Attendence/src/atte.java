import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class atte {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atte window = new atte();
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
	public atte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 448, 273);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Teachers Name");
		label.setBounds(5, 8, 109, 17);
		panel.add(label);
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(119, 5, 32, 24);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(156, 7, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Date");
		label_1.setBounds(275, 9, 34, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Course Code");
		label_2.setBounds(314, 9, 90, 15);
		panel.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(409, 5, 32, 24);
		panel.add(comboBox_1);
		
		JLabel label_3 = new JLabel("1");
		label_3.setBounds(446, 6, 13, 22);
		panel.add(label_3);
		label_3.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_4 = new JLabel("2");
		label_4.setBounds(464, 6, 13, 22);
		panel.add(label_4);
		label_4.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_5 = new JLabel("3");
		label_5.setBounds(482, 6, 13, 22);
		panel.add(label_5);
		label_5.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_6 = new JLabel("4");
		label_6.setBounds(500, 6, 13, 22);
		panel.add(label_6);
		label_6.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_7 = new JLabel("5");
		label_7.setBounds(518, 6, 13, 22);
		panel.add(label_7);
		label_7.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_8 = new JLabel("6");
		label_8.setBounds(536, 6, 13, 22);
		panel.add(label_8);
		label_8.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_9 = new JLabel("7");
		label_9.setBounds(554, 6, 13, 22);
		panel.add(label_9);
		label_9.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_10 = new JLabel("8");
		label_10.setBounds(572, 6, 13, 22);
		panel.add(label_10);
		label_10.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_11 = new JLabel("9");
		label_11.setBounds(590, 6, 13, 22);
		panel.add(label_11);
		label_11.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_12 = new JLabel("10");
		label_12.setBounds(608, 6, 26, 22);
		panel.add(label_12);
		label_12.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel label_13 = new JLabel("Mojibur Rahman");
		label_13.setBounds(639, 8, 125, 17);
		panel.add(label_13);
		label_13.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_14 = new JLabel("Nishita Jahan");
		label_14.setBounds(769, 8, 100, 17);
		panel.add(label_14);
		label_14.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_15 = new JLabel("Kanij Roksana");
		label_15.setBounds(874, 8, 109, 17);
		panel.add(label_15);
		label_15.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_16 = new JLabel("Arnima Anni");
		label_16.setBounds(988, 8, 95, 17);
		panel.add(label_16);
		label_16.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_17 = new JLabel("Kamruzzaman");
		label_17.setBounds(1088, 8, 111, 17);
		panel.add(label_17);
		label_17.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_18 = new JLabel("Rashed Kaysar");
		label_18.setBounds(1204, 8, 117, 17);
		panel.add(label_18);
		label_18.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_19 = new JLabel("Nahid");
		label_19.setBounds(1326, 8, 44, 17);
		panel.add(label_19);
		label_19.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_20 = new JLabel("Sabbir Hossain");
		label_20.setBounds(1375, 8, 117, 17);
		panel.add(label_20);
		label_20.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_21 = new JLabel("Shuvo Ahemed");
		label_21.setBounds(1497, 8, 119, 17);
		panel.add(label_21);
		label_21.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_22 = new JLabel("Sheikh Fahim");
		label_22.setBounds(1621, 8, 104, 17);
		panel.add(label_22);
		label_22.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_23 = new JLabel("No");
		label_23.setBounds(1730, 8, 21, 17);
		panel.add(label_23);
		label_23.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel label_24 = new JLabel("Name");
		label_24.setBounds(1756, 8, 44, 17);
		panel.add(label_24);
		label_24.setFont(new Font("Dialog", Font.BOLD, 14));
	}
}
