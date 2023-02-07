package Protected_Access_Specifier;

public class Sample2 
{
	protected int a;
	
	protected Sample2()
	{
		a=10;
	}
	protected void SquareOfNum()
	{
		System.out.println(a*a);
	}
    public static void main(String[] args)
    
    {
    	Sample2 s1=new Sample2();
    	s1.SquareOfNum();
    	System.out.println(s1.a);
    	
		
	}
}
