
package com.adaptionsoft.games.trivia.runner;
import java.util.Arrays;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameRunner {
	public static void main(String[] args) {
		if(args.length < 2 || args.length > 6) {
			throw new RuntimeException("Input a valid number of players.");
		}
		Game game = new Game();
		Arrays.stream(args).forEach(game::add);
		playGame(game, new Random());
	}

	private static void playGame(Game aGame, Random rand) {
		boolean notAWinner;
		do {
			aGame.roll(rand.nextInt(5) + 1);
			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
		} while (notAWinner);
	}
}
