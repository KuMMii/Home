package interfaces;

public class GameRunner {

	public static void main(String[] args) {
		
		GamingConsole[] games= {new MarioGame(),new ChessGame()};
		//polymorphism
		for(GamingConsole game:games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
		
//		MarioGame game=new MarioGame();
//		ChessGame game=new ChessGame();
		GamingConsole game=new ChessGame();

	}
}
