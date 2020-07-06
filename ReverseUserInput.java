/* This program will display the user inputs
 * in their reverse order. */

//Import the Scanner class in Java.
import java.util.Scanner;

//Class for displaying the user inputs in reverse.
public class ReverseUserInput {
	
	//Main method.
	public static void main (String[] args) {
		
		//Create an input object.
		Scanner input = new Scanner(System.in);
		
		//Ask for the user inputs.
		System.out.print("Please input ten Integers: ");
		
		//Create an array (with index 10) for the user inputs.
		int[] num = new int[10];
		
		//Create a for loop to store the multiple user inputs.
		for (int i = 0; i < 10; i++) { 
			
			//Store the user inputs.
			num[i] = input.nextInt();
			
		}	//For loop to take the user inputs.
		
		//Display the first line of the results.
		System.out.println("The reverse of the numbers are: ");
		
		//Display the user inputs in the reverse order.
		for (int i = 9; i >= 0; i--) { 
			
			//Display each results with a new line.
			System.out.println(num[i]);
			
		}	//For loop to display the results.
		
		//Close the input.
		input.close();
		
	}	//Main() Method.
	
}	//ReverseUserInput class.
