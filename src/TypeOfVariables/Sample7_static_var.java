package TypeOfVariables;

public class Sample7_static_var 
{
	static int i=122;
	public static void main(String[] args) 
	
	{
		System.out.println(i);
		System.out.println(Sample8.j);
		System.out.println(Sample8.k);
		System.out.println(Sample8.k);
		System.out.println(Sample8.k);
		System.out.println(Sample8.k);
		System.out.println(Sample8.k);
		System.out.println(i);
		m1();
		Sample7_static_var v1=new Sample7_static_var();
		v1.m2();
		
		
	}
	public static void m1()
	{
		System.out.println(i);
	}
	public void m2()
	{
		System.out.println(i);
	}
	

}
