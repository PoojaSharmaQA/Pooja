package assignment_4;

import java.util.Scanner;

public class Rev_String_words {

	public void ReverseWords(String str) {

		String rev[]= str.split(" ");
		for (int i=rev.length-1; i>=0;i--)
		{
			System.out.println(rev[i] + " ");
		}
	}

	public static void main(String[]   args) {      
		Rev_String_words RevWord= new Rev_String_words();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		RevWord.ReverseWords(str);
		sc.close();

	}

}



