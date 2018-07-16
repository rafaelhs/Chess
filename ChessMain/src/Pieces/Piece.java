package Pieces;

import java.util.ArrayList;

import main.Tile;

public abstract class Piece {
	private String color;
	private Tile tile;
	private String type;// = "pawn";
	private String imagePath;// = "C:\\Users\\Rafael\\Chess\\ChessMain\\src\\Pieces\\White_Pawn.png";
	
	public Piece(String color, Tile tile, String type) {
		this.color = color;
		this.tile = tile;
		this.type = type;
	}


	
	
	/*
	 * Return a ArrayList with the possible tiles to move
	 * */
	public abstract ArrayList<Tile> getPath(Tile board[][]);
	
	
	/*
	 * move the piece to the specified tile
	 * returns 1 if successful
	 * returns 0 if unsuccessful
	 * */
	public abstract int move(Tile tile);
	
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tile getTile() {
		return tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	

}
