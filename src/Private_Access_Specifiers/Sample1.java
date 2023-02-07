package Private_Access_Specifiers;

//import java.security.PublicKey;

public class Sample1
{
	private int a;
	
	private Sample1()
	
	{
		a=10;
	}
	private void SquareOfNum()
	{
		System.out.println(a*a);
		
	}
	
public static void main(String[] args) 
{
	Sample1 s1=new Sample1();
	s1.SquareOfNum();
	System.out.println(s1.a);
	
}
}
