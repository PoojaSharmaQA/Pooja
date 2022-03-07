package abstraction11;

public class Subclass2 extends Parent{
	
	void message()
	{
	
		System.out.println("This is second subclass");
	}
	
	public static void main(String[] args){ 
		
		subclass1 msg1= new  subclass1();
		Parent msg2= new  Subclass2();
		msg1.message();
		msg2.message();
	}
}
