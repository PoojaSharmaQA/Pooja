package assignment_1;

import java.util.Scanner;

public class Check_Num {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Please Enter a Number: ");
		
		double num=sc.nextDouble();

		if(num<300)
		{
			System.out.println("Given number is less than 300");
		}
		else if(num==300)
		{
			System.out.println("Given number is equal to 300");
		}
		else
		{
			System.out.println("Given number is greater than 300");
		}
		sc.close();

	}
}




