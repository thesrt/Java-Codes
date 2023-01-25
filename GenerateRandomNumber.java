package CipherSchoolCourse;
import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int computerChoice = rnd.nextInt(20);
				System.out.println("Computer Choice : "+computerChoice);
	}
}
