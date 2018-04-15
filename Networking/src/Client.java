import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.*;
public class Client extends Frame implements ActionListener{
	private Button b1;
	private TextField tf,tf1;
	//int a,b;
	String a,b;
	
	Client(){
		setLayout(new FlowLayout());
		setSize(500,500);
		setTitle("Networkinf");
		add(new Label("number"));
		tf=new TextField(10);
		add(tf);
		b1=new Button("Multiply");
		add(b1);
		tf1=new TextField(10);
		add(tf1);
		//tf2=new TextField(10);
		//add(tf2);
		b1.addActionListener(this);
		setVisible(true);
	}


	public static void main(String[] args) {
		new Client();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//a=Integer.parseInt(tf.getText());
		a=tf.getText();
		try {
			
			Socket s=new Socket("127.0.0.1",1201);
			//Scanner sc=new Scanner(System.in);
			//System.out.println("Enter a num: ");
			//a=sc.nextLine();
			PrintStream ps=new PrintStream(s.getOutputStream());
			ps.println(a);
			Scanner sc1=new Scanner(s.getInputStream());
			b=sc1.nextLine();
			tf1.setText(b+"");
			//System.out.println(b);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
	}

}
