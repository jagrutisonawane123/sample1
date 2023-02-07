package Exception_Handling;

public class Example2 
{
	public static void main(String[] args)
	{
		String s1="abcdd"; //0to4
		
		try
		{
			System.out.println(s1.charAt(7)); //Risky code
		}
		catch(StringIndexOutOfBoundsException s4)
		{
			System.out.println("StringIndexOutOfBounds Exception handed");
		}
		
		System.out.println("myra");
	}

}
