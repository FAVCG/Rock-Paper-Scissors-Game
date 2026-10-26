package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rock Paper Scissor Game!");

		// user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0:Rock, 1:Paper, 2:Scissors");

		int userChoice = scanner.nextInt();

		// validate input - users choice

		if (userChoice < 0 || userChoice > 2) {
			System.out.println("Invalid Choice! Please try again and enter 0, 1 or 2");
			return; // exit program
		}

		// Generate computer's random choice between 0 and 2
		int computerChoice = new Random().nextInt(3); // generates random numbers between 0 and 2
		System.out.println(computerChoice);
		// Determine the winner
		if (userChoice == computerChoice) {
			System.out.println("Its a tie");
		} else if (
				(userChoice == 0 && computerChoice == 2) || 
				(userChoice == 1 && computerChoice == 0) || 
				(userChoice == 2 && computerChoice == 1)
				) 
		{
			System.out.println("You win!!");
		} else {
			System.out.println("Computer wins!!");
		}
		scanner.close();
	}
}
