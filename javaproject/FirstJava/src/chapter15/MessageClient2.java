package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MessageClient2 {

	public static void main(String args[]) throws Exception {

		Socket s = new Socket("localhost", 6666);

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		Scanner sc = new Scanner(System.in);

		String str = "", str2 = "";

		while (!str.equals("exit")) {

			str = sc.nextLine();

			dout.writeUTF(str);

			dout.flush();

			str2 = din.readUTF();
			System.out.println("Server message: " + str2);

		}

		dout.close();
		s.close();
	}
}
