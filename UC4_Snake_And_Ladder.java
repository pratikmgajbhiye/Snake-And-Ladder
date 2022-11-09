package Snake_And_Ladder;

public class UC4_Snake_And_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player = 0;
		System.out.println("Start The Game");
		while (player < 100) {
			int optionCheck = (int) (Math.random() * 3) + 1;
			int dicecheck = (int) (Math.random() * 6) + 1;
			if (optionCheck == 1) {
				System.out.println("No play");
			} else if (optionCheck == 2) {
				player += dicecheck;
				if (player > 100) {
					player -= dicecheck;
				} else if (player == 100) {
					System.out.println("Player Win the Game and position is " + player);

				}
				System.out.println("Ladder Player position is " + player);
			} else if (optionCheck == 3) {
				player -= dicecheck;
				if (player <= 0) {
					player = 0;
				}
				System.out.println("Snake Player position is " + player);
			}
		}

	}

}
