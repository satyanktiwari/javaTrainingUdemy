package lessons.basics.getUserInput;

import java.util.Scanner;

public class GetUserInput {
	
	public static void main(String[] args) {
//		Scanner is a class since it begins with capital
		Scanner input = new Scanner(System.in);
//		prompt the user for input
		System.out.println("Enter your name: ");
//		Store the input
		String line =input.nextLine();
		System.out.println("You've entered: "+ line);
//		%d is used for a decimal value
		System.out.printf("This is the printf format \n----You've entered:%s\n",line);
		Scanner inputNew = new Scanner(System.in);
		System.out.println("Enter an int: ");
		int value = inputNew.nextInt();
		System.out.println("Value is: "+ value);
		input.close();
		inputNew.close();
	}
}
