package assignment_4;

import java.util.Scanner;

public class Reverse_String {
	
	public void Reverseletter(String str)
	{
		for(int i=str.length()-1;i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[]   args) {
	
		Reverse_String ReverseLetter= new Reverse_String();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a string");
		String str= sc.nextLine();
		sc.close();
		ReverseLetter.Reverseletter(str);
		
	}
}
