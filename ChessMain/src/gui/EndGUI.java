package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EndGUI extends JFrame implements MouseListener {
	private JLabel messageLabel = new JLabel("Placeholder");
	private JButton button = new JButton("ok");
	private MainGUI mainGUI;
	
	
	public EndGUI(MainGUI mainGUI) {
		super("Chess - " + mainGUI.getType());
		
		this.mainGUI = mainGUI;
		
		GridBagConstraints c = new GridBagConstraints();
		setLayout(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		add(this.messageLabel, c);
		
		c.gridx = 0;
		c.gridy = 1;
		this.button.addMouseListener(this);
		add(this.button, c);
		
		setLocation(100, 100);
		setSize(new Dimension(400,200));
		setLocationRelativeTo(null);
		setResizable(false);
		
	}

	
	public JLabel getMessageLabel() {
		return this.messageLabel;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.button) {
			System.exit(0);
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
