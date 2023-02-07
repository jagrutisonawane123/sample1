package Exception_Handling;

public class Example1 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];//0 to 3
		
		try
		{
			ar[2]=10; //Risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handed");
		}
		
		System.out.println("hii");
		System.out.println("good morning");
	}

}
