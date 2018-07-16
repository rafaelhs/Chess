package main;

import java.awt.Dimension;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import gui.ClientGUI;
import gui.ServerGUI;
import gui.StartGUI;

public class Main {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		Board board = new Board();
		StartGUI sgui = new StartGUI();
		ServerGUI svgui = new ServerGUI();
		ClientGUI cgui = new ClientGUI();
		
		
		board.setVisible(true);
		//sgui.setVisible(true);
		//svgui.setVisible(true);
		//cgui.setVisible(true);

		//board.setVisible(true);	
		/*
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//System.exit(0);
	}

}
