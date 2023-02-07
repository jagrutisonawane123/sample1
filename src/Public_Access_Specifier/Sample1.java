package Public_Access_Specifier;

public class Sample1 
{
	int a;
	
	Sample1()
	
	{
		a=12;
	}
	public void add()
	{
		System.out.println(a+a);
		
	}
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.add();
		System.out.println(s1.a);
		
	}

}
