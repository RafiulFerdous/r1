import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Attendance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendance frame = new Attendance();
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
	public Attendance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeachersName = new JLabel("Teachers Name");
		lblTeachersName.setBounds(10, 11, 100, 20);
		lblTeachersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblTeachersName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(120, 13, 135, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Khadijatul Kobra", "Shoukot Hossain", "Niyaz ", "Monir Alam"}));
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(375, 13, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(315, 13, 50, 20);
		contentPane.add(lblDate);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setBounds(536, 13, 100, 20);
		contentPane.add(lblCourseCode);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(646, 13, 100, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CSE-211", "CSE-212", "CSE-213", "GED-212"}));
		contentPane.add(comboBox_1);
		
		JLabel label1 = new JLabel("1");
		label1.setBounds(10, 78, 20, 20);
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("2");
		label2.setBounds(10, 109, 20, 20);
		label2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("3");
		label3.setBounds(10, 140, 20, 20);
		label3.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("4");
		label4.setBounds(10, 171, 20, 20);
		label4.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("5");
		label5.setBounds(10, 202, 20, 20);
		label5.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label5);
		
		JLabel label6 = new JLabel("6");
		label6.setBounds(10, 233, 20, 20);
		label6.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label6);
		
		JLabel label7 = new JLabel("7");
		label7.setBounds(10, 264, 20, 20);
		label7.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label7);
		
		JLabel label8 = new JLabel("8");
		label8.setBounds(10, 295, 20, 20);
		label8.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label8);
		
		JLabel label9 = new JLabel("9");
		label9.setBounds(10, 326, 20, 20);
		label9.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label9);
		
		JLabel label10 = new JLabel("10");
		label10.setBounds(10, 357, 25, 20);
		label10.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(label10);
		
		JLabel lblMojiburRahman = new JLabel("Mojibur Rahman");
		lblMojiburRahman.setBounds(40, 79, 120, 20);
		lblMojiburRahman.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblMojiburRahman);
		
		JLabel lblNishitaJahan = new JLabel("Nishita Jahan");
		lblNishitaJahan.setBounds(40, 110, 120, 20);
		lblNishitaJahan.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNishitaJahan);
		
		JLabel lblKanijRoksana = new JLabel("Kanij Roksana");
		lblKanijRoksana.setBounds(40, 141, 120, 20);
		lblKanijRoksana.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblKanijRoksana);
		
		JLabel lblArnimaAnni = new JLabel("Arnima Anni");
		lblArnimaAnni.setBounds(40, 172, 120, 20);
		lblArnimaAnni.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblArnimaAnni);
		
		JLabel lblKamruzzaman = new JLabel("Kamruzzaman");
		lblKamruzzaman.setBounds(40, 203, 120, 20);
		lblKamruzzaman.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblKamruzzaman);
		
		JLabel lblRashedKaysar = new JLabel("Rashed Kaysar");
		lblRashedKaysar.setBounds(40, 234, 120, 20);
		lblRashedKaysar.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblRashedKaysar);
		
		JLabel lblNahid = new JLabel("Nahid");
		lblNahid.setBounds(40, 265, 120, 20);
		lblNahid.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNahid);
		
		JLabel lblSabbirHossain = new JLabel("Sabbir Hossain");
		lblSabbirHossain.setBounds(40, 296, 120, 20);
		lblSabbirHossain.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSabbirHossain);
		
		JLabel lblShuvoAhemed = new JLabel("Shuvo Ahemed");
		lblShuvoAhemed.setBounds(40, 327, 120, 20);
		lblShuvoAhemed.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblShuvoAhemed);
		
		JLabel lblSheikhFahim = new JLabel("Sheikh Fahim");
		lblSheikhFahim.setBounds(40, 358, 120, 20);
		lblSheikhFahim.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblSheikhFahim);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNo.setBounds(10, 53, 20, 20);
		contentPane.add(lblNo);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(40, 54, 120, 20);
		contentPane.add(lblName);
		setVisible(true);
	}
}
