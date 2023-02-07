package Exception_Handling;

public class Example7 
{
	public static void main(String[] args) 
	{
		int [] ar=new int [5];
		try
		{
			ar[5]=20;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("ArrayIndexOutOfBounds Exeption handled");
		}
		try
		{
		ar[6]=50;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exeption Handled");
		}
		System.out.println("Good Evening");
		}
}