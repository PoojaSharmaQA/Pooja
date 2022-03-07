package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		
		int t=1;
		
		for(int i=0; i<5; i++)
		{ 
			for(int j=0; j<5; j++)
			{
				
				System.out.printf("%2d",t);
				t++;
			}
			
			System.out.println();
		}
	}
}
