package Exception_Handling;

public class Example3
{
	public static void main(String[] args)
{
		int i=10;
		
		int j=0;
		
		int div=0;
		
		try
		{
			div=i/j; //risky code
		}
	 catch(ArithmeticException s1)
			 {
		 System.out.println("(Arithmetic Exception handed");
			 }
		System.out.println(div);
		System.out.println("hiiiii hello");
}

}
