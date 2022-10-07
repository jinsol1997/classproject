package chapter15;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionTest {

	public static void main(String[] args) {
		
		String urlStr = "https://www.google.com";
		
		try {
			URL url = new URL(urlStr);
			
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			
			for(int i=1; i<=8; i++) {
				System.out.println(connection.getHeaderFieldKey(i) + " = " + connection.getHeaderField(i));
			}
			
			//InputStream in = connection.getInputStream();
			
//			while(true) {
//				
//				int data = in.read();
//				
//				if(data == -1) {
//					break;
//				}
//				
//				System.out.print((char)data);
//			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
