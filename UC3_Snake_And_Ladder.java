package Snake_And_Ladder;

public class UC3_Snake_And_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player = 0;
		System.out.println("Start The Game");

		int optionCheck = (int) (Math.random() * 3) + 1;
		int dicecheck = (int) (Math.random() * 6) + 1;
		if (optionCheck == 1) {
			System.out.println("No play");
		} else if (optionCheck == 2) {
			player += dicecheck;
			System.out.println("Ladder Player position is " + player);
		} else if (optionCheck == 3) {
			player -= dicecheck;
			System.out.println("Snake Player position is " + player);
		}

	}

}
