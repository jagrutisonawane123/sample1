package Exception_Handling;

public class Example6 
{
	public static void main(String[] args) 
	{
         int [] ar=new int[4];         //0-3
		
		try
		{
			ar[5]=10;                  //risky code
		}
		catch(ArithmeticException s1)
		{
			System.out.println("Arithmetic Exception handled");
		}
		catch (StringIndexOutOfBoundsException s2)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}		
		catch(ArrayIndexOutOfBoundsException s3)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(Exception s1)
		{
			System.out.println("generic Exception handled");
			s1.printStackTrace();
		}
	
		
		System.out.println("Hello");
		System.out.println("dhvani");
		
	}

}
