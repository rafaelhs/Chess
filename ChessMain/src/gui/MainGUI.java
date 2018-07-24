package gui;

import main.Board;

public class MainGUI {
	private StartGUI startGUI;
	private ServerGUI serverGUI;
	private ClientGUI clientGUI;
	private Board board;
	
	private String ip;
	
	
	
	
	
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
	}
	public void unsetServerGUI() {
		this.serverGUI.setVisible(false);
		this.serverGUI = null;
	}
	
	
	
	public void createClientGUI() {
		this.clientGUI = new ClientGUI(this);
		this.clientGUI.setVisible(true);
	}
	public void unsetClientGUI() {
		this.clientGUI.setVisible(false);
		this.clientGUI = null;
	}
	
	
	
	public void createBoard() {
		this.board = new Board();
		this.board.setVisible(true);
	}
	public void unsetBoard() {
		this.board.setVisible(false);
		this.board = null;
	}
	

	
	
	public void setIp(String ip) {
		this.ip = ip;
	}
}
