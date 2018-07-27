package multiplayer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiplayerServer extends MultiplayerCommunication{
	
	private int port;
	private String ip;
	private Socket connection;
	private ServerSocket server;
	
	public MultiplayerServer() {}
	
	public MultiplayerServer(int port) throws IOException {
		this.port = port;
		this.server = new ServerSocket(port);
	}
	
	public boolean establishConnection() {
		boolean establish = false;
		try {
			
			while(!establish) {
				this.connection = server.accept();
				establish = true;
			}
		
		} catch (IOException e) {
			return false;
		}
		
		return true;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Socket getConnection() {
		return connection;
	}

	public void setConnection(Socket connection) {
		this.connection = connection;
	}

	public ServerSocket getServer() {
		return server;
	}

	public void setServer(ServerSocket server) {
		this.server = server;
	}
	
}
