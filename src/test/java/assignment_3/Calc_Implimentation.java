package assignment_3;

import java.util.Scanner;

public class Calc_Implimentation {

	public static void main(String[] args) {


		Calculator calc=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for ADDITION");
		System.out.println("Press 2 SUBTRACTION");
		System.out.println("Press 3 for MULTIPLICATION");
		System.out.println("Press 4 for DIVISION");
		int choice= sc.nextInt();

		if(choice==1)
		{
			//calc.addition();
			int number=calc.addition();
			System.out.println("Result is : " +number);
		}
		else if (choice==2)
		{
			int number2=calc.subtraction();
			System.out.println("Result is :"+number2);
		}
		else if (choice==3)
		{
			int number3=calc.multiplication();
			System.out.println("Result is  : "+number3);
		}
		else if (choice==4)
		{
			int number4=calc.division();
			System.out.println("Result is : " +number4);
		}
		else
		{
			System.out.println("Please enter no. between 1 to 4");
		}

		sc.close();

	}
}
