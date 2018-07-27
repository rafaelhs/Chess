package multiplayer;

import java.io.IOException;
import java.util.Scanner;

public class Main {
/*
	public static void main(String[] args) {
		
		Move move = new Move(1, 2, 3, 4);
		String json = move.convertToJson();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1 - para server");
		System.out.println("2 - para client");
		
		int op = input.nextInt();
		input.nextLine();
		
		if(op == 1) {
			try {
				MultiplayerServer server = new MultiplayerServer(12345);
				boolean b = server.establishConnection();
				if(b) {
					System.out.println("Connection establish - Server.");
					System.out.println(server.receive(server.getConnection()));
					
					server.send(server.getConnection(), "!!!!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				MultiplayerClient client = new MultiplayerClient("localhost", 12345);
				System.out.println("Connection establish - Client.");
				
				client.send(client.getConnection(), json);
				//String str = input.nextLine();
				System.out.println(client.receive(client.getConnection()));

				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}
*/
}
