package CipherSchoolCourse;

import java.util.Scanner;

public class FindTickets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Speed : ");
		int speed = sc.nextInt();
		
		System.out.println("Today is your birthday :");
		boolean isbirthday = sc.nextBoolean();
		
		if(isbirthday==true)
		{
			speed=speed-5;
		}
		if(speed>80)
			System.out.println("High Ticket");
		else if (speed>=60)
			System.out.println("Mid Ticket");
		else 
			System.out.println("No Ticket");
	}
}
