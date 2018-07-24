package multiplayer;

public class Main {

	public static void main(String[] args) {
		
		Move move = new Move(1, 2, 3, 4);
		
		System.out.println(move.convertToJson());
		
	}

}
