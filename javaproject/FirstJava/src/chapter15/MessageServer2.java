package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessageServer2 {

	public static void main(String args[]) throws Exception {

		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		Scanner sc = new Scanner(System.in);

		String str = "", str2 = "";

		while (!str.equals("exit")) {

			str = din.readUTF();
			System.out.println("client message: " + str);

			str2 = sc.nextLine();

			dout.writeUTF(str2);
			dout.flush();
		}

		din.close();
		s.close();
		ss.close();
	}
}
