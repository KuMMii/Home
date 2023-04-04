package mar_2023;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[Client] Connected");
			
			socket.close();
			System.out.println("[Client] Disconnected");
		} catch (UnknownHostException e) {//IP or Domain name is wrong
			System.out.println("UnknownHostException"+e.toString());
		} catch (IOException e) { //IP or Port number not existing
			System.out.println("IOException:"+e.toString());
		}
	}

}
