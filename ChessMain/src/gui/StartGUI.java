package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartGUI extends JFrame implements MouseListener {
	
	private JLabel title = new JLabel("Chess");
	private JLabel type = new JLabel("Select connection type:");
	private JButton server = new JButton("Server");
	private JButton client = new JButton("Client");
	private JButton exit = new JButton("Exit");
	
	
	public StartGUI() {
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		//.fill = GridBagConstraints.HORIZONTAL;
		//c.weightx = 1;
		
		
		c.gridx = 1;
		c.gridy = 0;
		add(this.title, c);
		
		c.gridx = 1;
		c.gridy = 1;
		add(this.type, c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		add(this.server, c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 2;
		add(this.client, c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 2;
		add(this.exit, c);
		
		setLocation(100, 100);
		setSize(new Dimension(400,200));
		setLocationRelativeTo(null);
		setResizable(false);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
