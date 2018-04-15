import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class Attendance2 extends JFrame {
	private JPanel contentPane;
	private JTextField textField;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendance2 frame = new Attendance2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Attendance2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 514);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(40000, 32767));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane); 
		contentPane.setLayout(null);
		setPreferredSize(new Dimension(400,500) );
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 11, 1974, 298);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		
		JLabel lblTeachersName = new JLabel("Teachers Name");
		panel.add(lblTeachersName);
		lblTeachersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Khadijatul Kobra", "Shoukot Hossain", "Niyaz ", "Monir Alam"}));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		panel.add(lblDate);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		panel.add(lblCourseCode);
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE-211", "CSE-212", "CSE-213", "GED-212"}));
		
		JLabel label1 = new JLabel("1");
		panel.add(label1);
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label2 = new JLabel("2");
		panel.add(label2);
		label2.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label3 = new JLabel("3");
		panel.add(label3);
		label3.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label4 = new JLabel("4");
		panel.add(label4);
		label4.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label5 = new JLabel("5");
		panel.add(label5);
		label5.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label6 = new JLabel("6");
		panel.add(label6);
		label6.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label7 = new JLabel("7");
		panel.add(label7);
		label7.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label8 = new JLabel("8");
		panel.add(label8);
		label8.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label9 = new JLabel("9");
		panel.add(label9);
		label9.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label10 = new JLabel("10");
		panel.add(label10);
		label10.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblMojiburRahman = new JLabel("Mojibur Rahman");
		panel.add(lblMojiburRahman);
		lblMojiburRahman.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNishitaJahan = new JLabel("Nishita Jahan");
		panel.add(lblNishitaJahan);
		lblNishitaJahan.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblKanijRoksana = new JLabel("Kanij Roksana");
		panel.add(lblKanijRoksana);
		lblKanijRoksana.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblArnimaAnni = new JLabel("Arnima Anni");
		panel.add(lblArnimaAnni);
		lblArnimaAnni.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblKamruzzaman = new JLabel("Kamruzzaman");
		panel.add(lblKamruzzaman);
		lblKamruzzaman.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblRashedKaysar = new JLabel("Rashed Kaysar");
		panel.add(lblRashedKaysar);
		lblRashedKaysar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNahid = new JLabel("Nahid");
		panel.add(lblNahid);
		lblNahid.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblSabbirHossain = new JLabel("Sabbir Hossain");
		panel.add(lblSabbirHossain);
		lblSabbirHossain.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblShuvoAhemed = new JLabel("Shuvo Ahemed");
		panel.add(lblShuvoAhemed);
		lblShuvoAhemed.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblSheikhFahim = new JLabel("Sheikh Fahim");
		panel.add(lblSheikhFahim);
		lblSheikhFahim.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNo = new JLabel("No");
		panel.add(lblNo);
		lblNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblName = new JLabel("Name");
		panel.add(lblName);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		setVisible(true);
	}
}
