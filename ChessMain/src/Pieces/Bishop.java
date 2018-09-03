package Pieces;

import java.util.ArrayList;

import main.Tile;

public class Bishop extends Piece {

	
	public Bishop(String color, Tile tile) {
		super(color, tile, "bishop");
		if(color.equals("white")) {
			this.setImagePath("..\\Pieces\\White_Bishop.png");
		}else {
			this.setImagePath("..\\Pieces\\Black_Bishop.png");
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
