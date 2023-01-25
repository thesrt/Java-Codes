package CipherSchoolCourse;

import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int computerChoice = rnd.nextInt(20);
				System.out.println("Computer Choice : "+computerChoice);
		// Guess the number
				System.out.println("Guess a Number between 0 and 20");
				int userChoice = sc.nextInt();
				
				if (userChoice>computerChoice) {
					System.out.println("Your Guess is Too High");
				}
				else if (userChoice< computerChoice) {
					System.out.println("Your Guess is too Low");
				}
				else {
					System.out.println("Gotcha! You Guessed it Right!!");
				}
}
}