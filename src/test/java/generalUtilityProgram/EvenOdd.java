package generalUtilityProgram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int i=sc.nextInt();
		sc.close();
		if (i%2==0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
		
	}
}
