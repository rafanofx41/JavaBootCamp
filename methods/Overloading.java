package methods;

public class Overloading {

	public static void main(String[] args) {
		int newScore = calculateScore("Rafael", 70);
		System.out.println("new score is " + newScore);
		calculateScore(75);
		calculateScore();

	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player score " + score + " points");
		return score * 1000;
	}
	
	public static void calculateScore() {
		System.out.println("No player name, no player score");
	}
}
