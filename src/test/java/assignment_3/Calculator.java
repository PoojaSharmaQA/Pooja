package assignment_3;

import java.util.Scanner;

public class Calculator {
	
	public int addition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		sc.close();
		int Addnum= num1+num2;
		return Addnum;		
	}
	
	public int subtraction() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num3=sc.nextInt();
		System.out.println("Enter Second Number");
		int num4=sc.nextInt();
		sc.close();
		int Subnum= num3-num4;
		return Subnum;		
	}
	
	public int multiplication() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num3=sc.nextInt();
		System.out.println("Enter Second Number");
		int num4=sc.nextInt();
		sc.close();
		int Mulnum= num3*num4;
		return Mulnum;		
	}
	
	public int division() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num5=sc.nextInt();
		System.out.println("Enter Second Number");
		int num6=sc.nextInt();
		sc.close();
		int Divnum= num5/num6;
		return Divnum;		
	}
	
	
	
}
	

