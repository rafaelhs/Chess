package multiplayer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;

public abstract class MultiplayerCommunication {
	
	public boolean send(Socket connection, String message) {
		try {
			DataOutputStream dOut = new DataOutputStream(connection.getOutputStream());
			dOut.writeUTF(message);
			//dOut.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}
	
	public String receive(Socket connection) throws IOException {
		DataInputStream dIn = new DataInputStream(connection.getInputStream());
		
		return dIn.readUTF();
	}
	
}
