package assignment_2;

import java.util.Scanner;

public class Number_name {
	
	public static void main(String[] arg) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Number Name world");
		System.out.println("Please enter a no between 0 to 9");
		int digit=sc.nextInt();
	
		switch (digit)
		
		{
		case 0: System.out.println("ZERO");
		        break;
		case 1: System.out.println("ONE");
        		break;
		case 2: System.out.println("TWO");
        		break;
		case 3: System.out.println("THREE");
        		break;
		case 4: System.out.println("FOUR");
        		break;
		case 5: System.out.println("FIVE");
        		break;
		case 6: System.out.println("SIX");
        		break;
		case 7: System.out.println("SEVEN");
        		break;
		case 8: System.out.println("EIGHT");
        		break;
		case 9: System.out.println("NINE");
        		break;
		default: System.out.println("Invalid No");
				 System.out.println("Enter number between 0 to 9");
				 
	
      	}
		
		  sc.close();
	}

}
