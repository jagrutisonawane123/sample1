package Exception_Handling;

public class Example8 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];
		
		try
		{
			try
		{
			ar[5]=88;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
	     System.out.println("Array Index OutOfBounds Exception handled");
		}
		ar[5]=20;
		
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		System.out.println("i m excelent tester");
	}

}
