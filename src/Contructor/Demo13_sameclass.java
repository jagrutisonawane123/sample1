package Contructor;

public class Demo13_sameclass 



{
	public void test1()
	{
		System.out.println("Running test1");
		System.out.println("=============");
		
	}
	public void test2()
	{
		System.out.println("Running test2");
		System.out.println("=============");
		
	}
	public void test3()
	{
		System.out.println("Running test3");
		System.out.println("=============");
		
	}
	
	public static void main(String[] args)
	
	{
		Demo13_sameclass d3=new Demo13_sameclass ();
		d3.test1();
		d3.test2();
		d3.test3();
		
		Demo14_diffclass d4=new Demo14_diffclass();
		d4.test11();
		d4.test21();
	}

}
