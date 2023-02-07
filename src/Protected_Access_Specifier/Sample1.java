package Protected_Access_Specifier;

public class Sample1 
{
	protected int b;
	
	protected Sample1()
	
	{
      b=23;
	}
	protected void add()
	{
		System.out.println(b+b);
	}
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.add();
		System.out.println(s1.b);
		
		
	}

}
