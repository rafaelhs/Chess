package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tile extends JPanel{
	
	private int cX;
	private int cY;
	private Piece piece;
	
	
	
	public Tile(int x, int y) {
		this.cX = x;
		this.cY = y;
		setLayout(new BorderLayout());
		
		if((x+y)%2==0) {
			setBackground(new Color(113, 198, 113));
		} else {
			setBackground(Color.white);
		}
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
	}
	
	
	
	
	
	


	

}
