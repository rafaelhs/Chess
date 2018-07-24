package multiplayer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiplayerClient extends MultiplayerCommunication{
	
	private String ip;
	private int port;
	private Socket connection;
	
	MultiplayerClient(){}
	
	MultiplayerClient(String ip, int port) throws UnknownHostException, IOException{
		this.connection = new Socket(ip, port);
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Socket getConnection() {
		return connection;
	}

	public void setConnection(Socket connection) {
		this.connection = connection;
	}
	
	
}
