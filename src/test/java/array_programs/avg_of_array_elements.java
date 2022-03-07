package array_programs;

 public class avg_of_array_elements {
	
	public static void main(String[] args) {
	
	int avg=0, sum=0;
	int arr[] = new int[6];
	arr[0]= 1000;
	arr[1]= 1780;
	arr[2]= 6780;
	arr[3]= 6895;
	arr[4]= 1568;
	arr[5]= 1497;
	
	 
	for(int i=0; i<arr.length; i++)
	{
		sum = sum + arr[i];
			
			
	}
	
	System.out.println("Sum of the given numbers is: " +sum);
	avg = sum/6;
	System.out.println("Avg of the given numbers is: " +avg);
	
	}
	
 }


