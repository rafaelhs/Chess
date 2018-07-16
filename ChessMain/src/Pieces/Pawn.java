package Pieces;

import java.util.ArrayList;

import main.Tile;

public class Pawn extends Piece {

	
	
	public Pawn(String color, Tile tile) {
		super(color, tile, "pawn");
		if(!color.equals("white")) {
			this.setImagePath("C:\\Users\\Rafael\\Chess\\ChessMain\\src\\Pieces\\White_Pawn.png");
		}else {
			this.setImagePath("C:\\Users\\Rafael\\Chess\\ChessMain\\src\\Pieces\\Black_Pawn.png");
		}
	}
	

	
	@Override
	public ArrayList<Tile> getPath(Tile[][] board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int move(Tile tile) {
		// TODO Auto-generated method stub
		
		super.getTile().removeImage();
		
		tile.setPiece(this);
		
		return 0;
	}

}
