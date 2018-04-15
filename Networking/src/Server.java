import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		try {
			//int num, c;
			String a,b;
			ServerSocket s=new ServerSocket(1201);
			Socket ss=s.accept();
			//System.out.println("server is ready");
			Scanner s1=new Scanner(ss.getInputStream());
			a=s1.nextLine();
			b=a.substring(0, 9);
			//c=num*2;
			//System.out.print("server is waiting");
			//System.out.println(num);
			
			PrintStream ps=new PrintStream(ss.getOutputStream());
			ps.println(b);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
