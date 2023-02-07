package Exception_Handling;

public class Example5 
{
	public static void main(String[] args)
	{
		int [] ar=new int[4]; //0 to 3
		
		try
		{
			ar[4]=10;
		}
		catch(Exception s1)
		{
			System.out.println("generic Exception handled");
			s1.printStackTrace();
		}
		
		System.out.println("way to pune");
	}

}
