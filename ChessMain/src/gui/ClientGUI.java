package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements MouseListener {
	private JLabel serverLabel = new JLabel("Server ip: ");
	private JTextField serverText = new JTextField();
	private JButton button = new JButton("ok");
	
	public ClientGUI() {
		
		GridBagConstraints c = new GridBagConstraints();
		setLayout(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		add(this.serverLabel, c);
		c.gridx = 1;
		c.gridy = 0;
		this.serverText.setColumns(10);
		add(this.serverText, c);
		
		this.button.addMouseListener(this);
		add(this.button);
		
		setLocation(100, 100);
		setSize(new Dimension(400,200));
		setLocationRelativeTo(null);
		setResizable(false);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.button) {
			System.out.println(this.serverText.getText());
		}
		
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
