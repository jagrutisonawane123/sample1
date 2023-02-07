package Polymorprism_Overloading;

public class Demo3 
{
	public void div(int a,int b)
	{
		System.out.println(a/b);
		
	}
	
	public void div(int a, int b,int c)
	{
		System.out.println(a/b/c);
		
	}
	public static void main(String[] args)
	{
		Demo3 d3=new Demo3();
		d3.div(33, 11);
		d3.div(999, 33, 3);
		
	}

}
