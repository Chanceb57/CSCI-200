package shoppingCart;

import java.util.Scanner;


public class userInput {
public static void main(String[] args)

{
	String firstName, lastName;
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your First Name: ");
	firstName = scan.nextLine();
	
	System.out.print("Enter your Last Name: ");
	lastName = scan.nextLine();
	
	
	
	System.out.println("Your name is " + firstName + " " + lastName); //this is just to verify that the name inputed is correct
	
}
}
