package Class_Examples;

public class calculator {
	int num1, num2, num, ch;

	public void Calculator(int ch) {

		switch(ch) {
		case 1: System.out.println("Welcome to the addition zone");
		        num1= 10;
		        num2=20;
		        num=num1+num2;
		        System.out.println("First number is :"+num1);
		        System.out.println("Second no is :"+num2);
		        System.out.println("Result of addition is: "+num);
		        break;
		case 2: System.out.println("Welcome to the Subtraction zone");
        		num1= 10;
        		num2=20;
        		num=num1-num2;
        		System.out.println("First number is :"+num1);
		        System.out.println("Second no is :"+num2);
        		System.out.println("Result of Subtraction is: " +num);
        		break;
		case 3: System.out.println("Welcome to the multiplication zone");
        		num1= 10;
        		num2=20;
        		num=num1*num2;
        		System.out.println("First number is :"+num1);
		        System.out.println("Second no is :"+num2);
        		System.out.println("Result of multiplication is: "+num);
        		break;
		case 4: System.out.println("Welcome to the division zone");
        		num1= 10;
        		num2=20;
        		num=num1/num2;
        		System.out.println("First number is :"+num1);
		        System.out.println("Second no is :"+num2);
        		System.out.println("Result of division is: "+num);
        		break;

		}
		
	}
public static void main(String[] args) {
	calculator xyz=new calculator();
	xyz.Calculator(4);
	
	
}

}
