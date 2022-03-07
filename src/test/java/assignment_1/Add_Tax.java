package assignment_1;

import java.util.Scanner;

public class Add_Tax {
	public static void main(String[]  args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Please enter bill amount");
		double bill= sc.nextDouble();
		double TotalBill;

		if (bill<=300 || bill==500)
		{
			TotalBill= bill+50;
			System.out.println("Total bill is: "+TotalBill);			
		}
		else if(bill>500)
		{
			if(bill==1000|| bill<1000)
			{
				TotalBill = bill+10;
				System.out.println("Total bill is: "+TotalBill);

			}
			else
			{
				System.out.println("Total bill is: "+bill);
			}
			sc.close();

		}
	}
}


