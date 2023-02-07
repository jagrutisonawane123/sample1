package TypeOfVariables;

public class Sample_local_static_var 
{
	static int a=10;
	
	public static void main(String[] args)
	{
		
		System.out.println(a);
		m1();
		
		Sample_local_static_var v1=new Sample_local_static_var();
		v1.m2();
		
		
		
		
	}
    public static void m1()
    {
    	int b=20;
    	System.out.println(b);
    }
    public void m2()
    {
    	System.out.println(a);
    }
}
