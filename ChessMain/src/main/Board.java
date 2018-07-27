package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Pieces.Bishop;
import Pieces.King;
import Pieces.Knight;
import Pieces.Pawn;
import Pieces.Piece;
import Pieces.Queen;
import Pieces.Rook;
import gui.MainGUI;
import multiplayer.Move;

public class Board extends JFrame implements MouseListener {
	private Tile board[][] = new Tile[8][8];
	private static Tile lastSelect = null;
	private static Tile currentSelect = null;
	private MainGUI mainGUI;
	private boolean turn;
	
	
	
	

	
	public Board(MainGUI mainGUI) {
		super("Chess");
		this.mainGUI = mainGUI;
		
		
		System.out.println(this.mainGUI.getType());
		
		if(this.mainGUI.getType().equals("server")) {
			this.turn = true;
		} else {
			this.turn = false;
		}
		
		JPanel boardPanel = new JPanel(new GridLayout(8, 8));
		

		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				Tile tile = new Tile(i, j);
				tile.addMouseListener(this);
				this.board[i][j] = tile;
				boardPanel.add(this.board[i][j]);
			}
		}
		Piece p;
		p = new Rook("black", board[0][0]);
		board[0][0].setPiece(p);
		p = new Knight("black", board[0][1]);
		board[0][1].setPiece(p);
		p = new Bishop("black", board[0][2]);
		board[0][2].setPiece(p);
		p = new King("black", board[0][3]);
		board[0][3].setPiece(p);
		p = new Queen("black", board[0][4]);
		board[0][4].setPiece(p);
		p = new Bishop("black", board[0][5]);
		board[0][5].setPiece(p);
		p = new Knight("black", board[0][6]);
		board[0][6].setPiece(p);
		p = new Rook("black", board[0][7]);
		board[0][7].setPiece(p);
		
		p = new Pawn("black", board[1][0]);
		board[1][0].setPiece(p);
		p = new Pawn("black", board[1][1]);
		board[1][1].setPiece(p);
		p = new Pawn("black", board[1][2]);
		board[1][2].setPiece(p);
		p = new Pawn("black", board[1][3]);
		board[1][3].setPiece(p);
		p = new Pawn("black", board[1][4]);
		board[1][4].setPiece(p);
		p = new Pawn("black", board[1][5]);
		board[1][5].setPiece(p);
		p = new Pawn("black", board[1][6]);
		board[1][6].setPiece(p);
		p = new Pawn("black", board[1][7]);
		board[1][7].setPiece(p);
		
		
		p = new Rook("white", board[7][0]);
		board[7][0].setPiece(p);
		p = new Knight("white", board[7][1]);
		board[7][1].setPiece(p);
		p = new Bishop("white", board[7][2]);
		board[7][2].setPiece(p);
		p = new King("white", board[7][3]);
		board[7][3].setPiece(p);
		p = new Queen("white", board[7][4]);
		board[7][4].setPiece(p);
		p = new Bishop("white", board[7][5]);
		board[7][5].setPiece(p);
		p = new Knight("white", board[7][6]);
		board[7][6].setPiece(p);
		p = new Rook("white", board[7][7]);
		board[7][7].setPiece(p);
		
		p = new Pawn("white", board[6][0]);
		board[6][0].setPiece(p);
		p = new Pawn("white", board[6][1]);
		board[6][1].setPiece(p);
		p = new Pawn("white", board[6][2]);
		board[6][2].setPiece(p);
		p = new Pawn("white", board[6][3]);
		board[6][3].setPiece(p);
		p = new Pawn("white", board[6][4]);
		board[6][4].setPiece(p);
		p = new Pawn("white", board[6][5]);
		board[6][5].setPiece(p);
		p = new Pawn("white", board[6][6]);
		board[6][6].setPiece(p);
		p = new Pawn("white", board[6][7]);
		board[6][7].setPiece(p);
		
		
		
		setMinimumSize(new Dimension(800,700));
		add(boardPanel);
		
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	
	public void waitMove() {
		try {
			Move move = this.mainGUI.receiveMove();
			board[move.getxOrigin()][move.getyOrigin()].getPiece().move(board[move.getxEnd()][move.getyEnd()]);
			this.turn = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//lastSelect.getPiece().move(currentSelect);

		
		
	}

	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(!this.turn) return;

		
		if(lastSelect == null) {
			lastSelect = (Tile)arg0.getSource();
			lastSelect.selectTile();
			return;
		}else {
			currentSelect = (Tile)arg0.getSource();
			
			
			if(lastSelect.getPiece() != null) {
				this.mainGUI.setOrigin(lastSelect);
				this.mainGUI.setDestiny(currentSelect);
				this.mainGUI.setMoveSelect(true);
				
				
			
			}
			lastSelect.deselectTile();
			lastSelect = null;
			currentSelect = null;
		}
		
		
		
	}

	public boolean isTurn() {
		return turn;
	}


	public void setTurn(boolean turn) {
		this.turn = turn;
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
