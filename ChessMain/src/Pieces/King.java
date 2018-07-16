package Pieces;

import java.util.ArrayList;

import main.Tile;

public class King extends Piece {

	public King(String color, Tile tile) {
		super(color, tile, "king");
		if(color.equals("white")) {
			this.setImagePath("src\\Pieces\\White_King.png");
		}else {
			this.setImagePath("src\\Pieces\\Black_King.png");
		}
	}
	
	
	@Override
	public ArrayList<Tile> getPath(Tile[][] board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int move(Tile tile) {
		super.getTile().removeImage();
		super.getTile().setPiece(null);
		tile.setPiece(this);
		super.setTile(tile);
		return 0;
	}

}
