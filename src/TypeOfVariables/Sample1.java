package TypeOfVariables;

public class Sample1 
{
	int a=10; //global variable
	
	public void m1()
	{
		int b=20; //local variable 
		System.out.println(a);
		System.out.println(b);
	}
	public void m2()
	{
		int c =33; //local variable
		System.out.println(a);
		System.out.println(c);
		//System.out.println(b);
	}
	

}
