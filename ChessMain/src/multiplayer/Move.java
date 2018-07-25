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
	
	public static Move convertToObject(String json) {
		String[] tokens = json.split(",");
		String[] xO, yO, xE, yE;
		xO = tokens[0].split(":");
		yO = tokens[1].split(":");
		xE = tokens[2].split(":");
		yE = tokens[3].split(":");
		
		yE[1] = yE[1].replace("}", "");
		
		Move newMove = new Move(Integer.parseInt(xO[1]), Integer.parseInt(yO[1]), Integer.parseInt(xE[1]), Integer.parseInt(yE[1]));

		return newMove;
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
