package Exception_Handling;

public class Example4 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5]; //0 to 4
		
		try
		{
			ar[5]=70;
		}
		catch(ArithmeticException s1)
		{
			System.out.println("Arithmetic Exception handed");
		}
		catch(ArrayIndexOutOfBoundsException s3)
		{
			System.out.println(" ArrayIndexOutOfBounds Exception handed ");
		}
		System.out.println("pune");
		
	}

}
