package Pieces;

import java.util.ArrayList;

import main.Tile;

public class Knight extends Piece {

	public Knight(String color, Tile tile) {
		super(color, tile, "knight");
		if(color.equals("white")) {
			this.setImagePath("src\\Pieces\\White_Knight.png");
		}else {
			this.setImagePath("src\\Pieces\\Black_Knight.png");
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
