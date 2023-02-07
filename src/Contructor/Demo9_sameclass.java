package Contructor;

public class Demo9_sameclass
{
	public void p1()
	{
		System.out.println("Running p1 same class");
		System.out.println("-------------------");
	}
	public void p2()
	{
		System.out.println("Running p2 same class");
		System.out.println("-------------------");
	}
	public void p3()
	{
		System.out.println("Running p3 same class");
		System.out.println("-------------------");
	}
	public void p4()
	{
		System.out.println("Running p4 same class");
		System.out.println("-------------------");
	}
	
	
	public static void main(String[] args) 
	
	{
		Demo9_sameclass a1=new Demo9_sameclass();
		a1.p1();
		a1.p2();
		a1.p3();
		a1.p4();
		
		
		Demo10_diffclass a2=new Demo10_diffclass();
		a2.p5();
		a2.p6();
		a2.p7();
		
	}
	

}
