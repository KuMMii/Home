package days19;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpIp01 {
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		
		System.out.println("-----------------------------");
		System.out.println("Type q or Q and Enter to Quit the server");
		System.out.println("-----------------------------");
		
		//TCP Server Start
		startServer();
		
		//Keyboard Input
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
		//TCP Server close
		stopServer();
	}
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {
			public void run() {
				try {
					//ServerSocket generate &bind Port
					serverSocket= new ServerSocket(50001);
					System.out.println("[Server] Start");
					
					while(true) {
						System.out.println("\n[Server] wating for connection\n");
						//연결 수락
						Socket socket = serverSocket.accept();
						//Connected Client Info
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[Server] "+clientIp+" allowing Connection");
						//Disconnecting
						socket.close();
						System.out.println("[Server] "+clientIp+" disconnected");
					}
				} catch (IOException e) {
					System.out.println("[Server]"+e.getMessage());
					e.printStackTrace();
				}
			}
		};
		//Thread Start
		thread.start();
	}
	
	public static void stopServer() {
		//Closing ServerSocket and Unbinding Port
		try {
			serverSocket.close();
		} catch (IOException e) {
		}
	}
}
