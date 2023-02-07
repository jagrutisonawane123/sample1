package TypeOfVariables;

public class Sample3 
{
	int x=11;  //non static global variable
	public void k1()
	{
		
		int y=12; //non_static local vrible
		System.out.println(x);
		System.out.println(y);
		
	}
	public void k2()
	{
		int z=13;
		System.out.println(x);
		System.out.println(z);
		
	}

}
