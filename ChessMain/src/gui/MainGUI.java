package gui;

import java.io.IOException;
import java.net.UnknownHostException;

import main.Board;
import main.Tile;
import multiplayer.Move;
import multiplayer.MultiplayerClient;
import multiplayer.MultiplayerCommunication;
import multiplayer.MultiplayerServer;

public class MainGUI implements Runnable{
	private StartGUI startGUI;
	private ServerGUI serverGUI;
	private ClientGUI clientGUI;
	private EndGUI endGUI;
	private Board board;
	
	private String ip;
	
	private MultiplayerServer server;
	private MultiplayerClient client;
	
	private String type;
	
	
	
	private boolean typeSelect;
	private boolean ipSelect;
	private boolean moveSelect;
	
	






	private Tile origin;
	private Tile destiny;
	
	
	
	
	
	public void setMoveSelect(boolean moveSelect) {
		this.moveSelect = moveSelect;
	}
	public void setOrigin(Tile origin) {
		this.origin = origin;
	}
	public void setDestiny(Tile destiny) {
		this.destiny = destiny;
	}
	public void createStartGUI() {
		this.startGUI = new StartGUI(this);
		this.startGUI.setVisible(true);
	}
	public void unsetStartGUI() {
		this.startGUI.setVisible(false);
		this.startGUI = null;
	}

	
	
	public void createServerGUI() {
		this.serverGUI = new ServerGUI(this);
		this.serverGUI.setVisible(true);
		this.type = "server";
	}
	public void unsetServerGUI() {
		this.serverGUI.setVisible(false);
		this.serverGUI = null;
		
	}
	
	
	
	public void createClientGUI() {
		this.clientGUI = new ClientGUI(this);
		this.clientGUI.setVisible(true);
		this.type = "client";
	}
	public void unsetClientGUI() {
		this.clientGUI.setVisible(false);
		this.clientGUI = null;
	}
	
	
	
	public void createBoard() {
		this.board = new Board(this);
		this.board.setVisible(true);
	}
	public void unsetBoard() {
		this.board.setVisible(false);
		this.board = null;
	}
	
	public void createEndGUI(String text) {
		this.endGUI = new EndGUI(this);
		this.endGUI.getMessageLabel().setText(text);
		this.endGUI.setVisible(true);
	}
	public void unsetEndGUI() {
		this.endGUI.setVisible(false);
		this.endGUI = null;
	}
	
	
	
	public int createServer() {
		try {
			this.server = new MultiplayerServer(20132);
			return 1;
		} catch (IOException e) {
			return 0;
		}
	}
	
	
	public void waitConnection() {
		this.server.establishConnection();
	}
	
	
	
	
	public int createClient() {
		try {
			this.client = new MultiplayerClient(ip, 20132);
			return 1;
		} catch (IOException e) {
			return 0;
		}
		
	}
	
	
	public void sendMove(Move move) {
		String json = move.convertToJson();
		if(this.type.equals("client")) {
			this.client.send(client.getConnection(), json);
		}else if(this.type.equals("server")) {
			this.server.send(server.getConnection(), json);
		}
	}
	
	public Move receiveMove() throws IOException { 
		if(this.type.equals("client")) {
			return Move.convertToObject(client.receive(client.getConnection()));
		}else if(this.type.equals("server")) {
			return Move.convertToObject(server.receive(server.getConnection()));
		}else {
			return null;
		}
	}

	

	

	
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setTypeSelect(Boolean typeSelect) {
		this.typeSelect = typeSelect;
	}
	public void setIpSelect(Boolean ipSelect) {
		this.ipSelect = ipSelect;
	}
	
	
	
	
	
	
	
	@Override
	public void run() {
		this.createStartGUI();
		this.typeSelect = false;
		while(!this.typeSelect) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(this.type.equals("server")) {
			this.createServerGUI();
			this.unsetStartGUI();
			this.createServer();
			this.waitConnection();
			this.unsetServerGUI();
			
			
			this.createBoard();
		}else if(this.type.equals("client")) {
			this.setType("client");
			this.setTypeSelect(true);
			this.createClientGUI();
			this.unsetStartGUI();
			
			
			this.ipSelect = false;
			while(!this.ipSelect) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(true) {/*testar se ip e valido*/
				this.createClient();
				this.unsetClientGUI();
				
				try {Thread.sleep(2000);} 
				catch (InterruptedException e) {e.printStackTrace();}
				
				this.createBoard();
				this.board.waitMove();
				
			}else {
			}
		}
		
		while(true) {
			while(!this.moveSelect) {
				try {Thread.sleep(100);} 
				catch (InterruptedException e) {e.printStackTrace();}
			}
			
			
			if(this.destiny.getPiece()!=null) {
				if(this.destiny.getPiece().getType().equals("king")) {
					this.origin.getPiece().move(this.destiny);
					
					
					this.createEndGUI("Winner!");
					Move move = new Move(9, 9, 9, 9);
					this.sendMove(move);
					this.unsetBoard();
					break;
					
				}
			}
			this.origin.getPiece().move(this.destiny);
			

		
			
			
			Move move = new Move(this.origin.getcX(), this.origin.getcY(), this.destiny.getcX(), this.destiny.getcY());
			this.sendMove(move);
			this.board.setTurn(false);
			this.moveSelect = false;
			this.board.waitMove();
			
			
			
			
			
		}
		
		
		
		
	}
}
