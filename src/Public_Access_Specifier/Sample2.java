package Public_Access_Specifier;

public class Sample2 
{
	int i;
	
	Sample2()
	{
		i=30;
		
	}
	public void multiplication()
	{
		System.out.println(i*i);
		
	}
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2();
		s2.multiplication();
		System.out.println(s2.i);
		
	}

}
