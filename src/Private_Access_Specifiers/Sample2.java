package Private_Access_Specifiers;

public class Sample2 
{
	private int n;
	
	
	private Sample2()
	{
		n=66;
	}
	private void addofnum()
	{
		System.out.println(n+n);
	}
    public static void main(String[] args)
    {
    	Sample2 s2=new Sample2();
    	s2.addofnum();
    	System.out.println(s2.n);
		
	}
}
