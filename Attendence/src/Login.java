import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	//private final JLabel lblLogin = DefaultComponentFactory.getInstance().createTitle("Login");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserName.setBounds(82, 68, 110, 20);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(82, 125, 110, 20);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(202, 70, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 125, 150, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = passwordField.getText();
				String username = textField.getText();
				
				if(password.contains("4506")  && username.contains("kamrul")){
					passwordField.setText(null);
					textField.setText(null);
					
					Attendance.main(null);
					
					 
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Ivalid User Name or Password");
				}
			}
		});
		btnLogin.setBackground(SystemColor.textHighlight);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(171, 181, 89, 23);
		contentPane.add(btnLogin);
		//lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		//lblLogin.setBounds(171, 0, 120, 30);
		//contentPane.add(lblLogin);
	}
}
