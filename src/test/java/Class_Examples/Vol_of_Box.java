package Class_Examples;

public class Vol_of_Box {

	int length;
	int breadth;
	int width;
	int Volume;

	public void volume()
	{
		System.out.println("Hi! We are finding volume of the box");
		length=10;
		breadth=20;
		width=50;
		System.out.println("Length of the box is:"+length);
		System.out.println("breadth of the box is:"+breadth);
		System.out.println("width of the box is:"+width);
		
		Volume = length * breadth * width;
		System.out.println("Volume of the box is :" +Volume);
	}
	

    public static void main(String[] args) {
	Vol_of_Box abc= new Vol_of_Box();
	abc.volume();
	
    }

}
