package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pieces.Pawn;

public class Board extends JFrame implements MouseListener {
	private Tile board[][] = new Tile[8][8];
	private static Tile lastSelect = null;
	private static Tile currentSelect = null;
	
	
	
	
	
	
	public Board() {
		super("Chess");
		
		JPanel boardPanel = new JPanel(new GridLayout(8, 8));
		

		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				Tile tile = new Tile(i, j);
				tile.addMouseListener(this);
				this.board[i][j] = tile;
				boardPanel.add(this.board[i][j]);
			}
		}
		
		Pawn p = new Pawn("black", board[0][0]);
		board[0][0].setPiece(p);

		Pawn p2 = new Pawn("white", board[7][7]);
		board[7][7].setPiece(p2);
		
		setMinimumSize(new Dimension(800,700));
		add(boardPanel);
		
		setLocationRelativeTo(null);
		setResizable(false);

		
		
	}
	
	
	
	
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		/*Tile t = (Tile)arg0.getSource();
		t.setBackground(Color.blue);*/
		
		
		if(lastSelect == null) {
			lastSelect = (Tile)arg0.getSource();
			lastSelect.selectTile();
			return;
		}else {
			currentSelect = (Tile)arg0.getSource();
			
			
			if(lastSelect.getPiece() != null) {
				
				lastSelect.getPiece().move(currentSelect);
			}
			lastSelect.deselectTile();
			lastSelect = null;
			currentSelect = null;
		}
		
		
		
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
