package multiplayer;

public class Move {
	
	private int xOrigin;
	private int yOrigin;
	private int xEnd;
	private int yEnd;
	
	Move(){}
	
	Move(int xOrigin, int yOrigin, int xEnd, int yEnd){
		this.xOrigin = xOrigin;
		this.yOrigin = yOrigin;
		this.xEnd = xEnd;
		this.yEnd = yEnd;	
	}
	
	public String convertToJson() {
		 return String.format("{\"xOrigin\":%d, \"yOrigin\":%d, \"xEnd\":%d, \"yEnd\":%d}", this.xOrigin, this.yOrigin, this.xEnd, this.yEnd);
	}
	
	public int getxOrigin() {
		return xOrigin;
	}
	
	public void setxOrigin(int xOrigin) {
		this.xOrigin = xOrigin;
	}
	
	public int getyOrigin() {
		return yOrigin;
	}
	
	public void setyOrigin(int yOrigin) {
		this.yOrigin = yOrigin;
	}
	
	public int getxEnd() {
		return xEnd;
	}
	
	public void setxEnd(int xEnd) {
		this.xEnd = xEnd;
	}
	
	public int getyEnd() {
		return yEnd;
	}
	
	public void setyEnd(int yEnd) {
		this.yEnd = yEnd;
	}
	
}
