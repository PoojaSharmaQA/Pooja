package generalUtilityProgram;

import java.util.Scanner;

public class FactImp {
	
	void findFact()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		sc.close();
		int fact=1;
		for(int j=1;j<=num; j++)
		{
			fact=fact* j;
		}
		System.out.println("Factorial of "+ num + " is "+fact);
	}
	
	public static void main(String[] args){
		
		FactImp fac= new FactImp();
		fac.findFact();
		
		
	}
}



