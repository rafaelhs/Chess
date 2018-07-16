package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Pieces.Piece;

public class Tile extends JPanel{
	
	private int cX;
	private int cY;
	private Piece piece = null;
	private JLabel image;
	
	
	
	
	public Tile(int x, int y) {
		this.cX = x;
		this.cY = y;
		setLayout(new BorderLayout());
		
		if((x+y)%2==0) {
			setBackground(new Color(102, 51, 0));
		} else {
			setBackground(Color.white);
		}
		
		image = new JLabel();
		add(image, JLabel.CENTER);
		
		
	}



	
	
	public void selectTile() {
		setBorder(new LineBorder(Color.blue, 2));
	}
	public void deselectTile() {
		setBorder(null);
	}
	
	public void removeImage() {
		this.image.setIcon(null);
	}
	
	public void setImage(String path) {
		this.image.setIcon(new ImageIcon(path));
		this.image.setHorizontalAlignment(SwingConstants.CENTER);
		
	}

	public int getcX() {
		return cX;
	}

	public void setcX(int cX) {
		this.cX = cX;
	}

	public int getcY() {
		return cY;
	}

	public void setcY(int cY) {
		this.cY = cY;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
		piece.setTile(this);
		this.setImage(piece.getImagePath());
	}
	
	
	
	
	
	


	

}
