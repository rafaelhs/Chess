package main;

import java.awt.Dimension;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import gui.ClientGUI;
import gui.MainGUI;
import gui.ServerGUI;
import gui.StartGUI;

public class Main {

	public static void main(String[] args) throws UnknownHostException {
		
		MainGUI mainGUI = new MainGUI();
		mainGUI.run();
		
	}

}
