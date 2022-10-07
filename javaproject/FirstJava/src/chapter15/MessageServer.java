package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessageServer {

	public static void main(String[] args) {

		try {

			ServerSocket serverSocket = new ServerSocket(5555);
			System.out.println("소켓 서버가 실행 되었습니다.");

			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");

			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

			Scanner sc = new Scanner(System.in);

			// 수신 문자열
			String str1 = "";
			// 전송 문자열
			String str2 = "";

			while (!str1.equals("exit")) {

				str1 = din.readUTF();
				
				System.out.println("Client : " + str1);
				str2 = sc.nextLine();
				
				dout.writeUTF(str2);
				dout.flush();
			}

			din.close();
			socket.close();
			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
