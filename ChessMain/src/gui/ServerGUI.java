package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ServerGUI extends JFrame implements MouseListener{
	private JLabel wait = new JLabel("Waiting connection...");
	private JLabel ip;
	
	public ServerGUI(){
		try {
			ip = new JLabel("Server ip: "+InetAddress.getLocalHost().getHostAddress());
		}catch(IOException e) {
			ip = new JLabel("ERROR");
		}
		GridBagConstraints c = new GridBagConstraints();
		setLayout(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		add(this.ip, c);
		c.gridx = 0;
		c.gridy = 2;
		add(this.wait, c);
		
		setLocation(100, 100);
		setSize(new Dimension(400,200));
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
