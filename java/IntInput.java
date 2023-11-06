// import java.io.*;
import java.util.Scanner;

class IntInput
{
	public static void main(String[] args) 
	{
		int varInput;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");	
		
		try {
			varInput = scanner.nextInt();
			System.out.print(varInput);	
		} catch (Exception e) {
			System.out.print("Please enter a number");	
		}
	}
}