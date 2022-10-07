package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) {

		try {
			Socket s = new Socket("localhost", 5555);

			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());

			String str1 = "";
			String str2 = "";

			Scanner sc = new Scanner(System.in);

			while (!str1.equals("exit")) {
				
				str1 = sc.nextLine();
				
				dout.writeUTF(str1);
				
				dout.flush();

				str2 = din.readUTF();
				System.out.println("Server : " + str2);

			}

			dout.close();
			s.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
