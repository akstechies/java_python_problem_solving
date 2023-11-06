// StringInput
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;

class StringInput
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader  reader = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a char");
		String strInput = reader.readLine();
		System.out.println("Char entered is: " + strInput);	

		// ================
		System.out.println("=============Scanner=============");
		System.out.println("Enter a char");
		Scanner scanner = new Scanner(System.in);
		String strInput2 = scanner.nextLine();
		System.out.println("Char entered is: " + strInput2);

		// ================
		System.out.println("=============Console=============");
		System.out.println("Enter a char");
		String strInput3 = System.console().readLine();
		System.out.println("Char entered is: " + strInput3);

		// ================
		System.out.println("=============Args============="); 
		// Args is what when you run command line then type ------ java StringInput.java Hello -- so Hello will be printed
		if(args.length > 0) {
			for (String i : args) {
				System.out.println("args entered is: " + i);
			}
		}
	}
}