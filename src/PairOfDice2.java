import java.util.Random;
import java.util.Scanner;

public class PairOfDice2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");

		System.out.println("How many sides should each die have?");
		int sideAnswer = scnr.nextInt();

		String rollAnswer = "y";

		while (rollAnswer.equals("y")) {
			System.out.println(generateRandomDieRoll(sideAnswer));

			System.out.println("Roll again? (y/n):...");
			rollAnswer = scnr.next();
		}
		System.out.println("Error....");
		scnr.close();
	}

	public static int generateRandomDieRoll(int dieRoll) {

		Random diceRolled = new Random();
		int roll = diceRolled.nextInt(dieRoll);
		return roll;
		
		/*
		 * for (int i = 0; i < dieRoll; i++) { System.out.println((int) Math.random() +
		 * 1);
		 * 
		 * }
		 */

	}

}
