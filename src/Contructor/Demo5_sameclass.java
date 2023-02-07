package Contructor;

public class Demo5_sameclass 

{
	public void n1()
	{
		System.out.println("Running n1");
		
		System.out.println("-----------------");
	}
	public void n2()
	{
		System.out.println("Running n2");
		System.out.println("--------------");
	}
	
	public static void main(String[] args)
	{ 
		Demo5_sameclass d1=new Demo5_sameclass();
		d1.n1();
		d1.n2();
		
		Demo6_diffclass d2=new Demo6_diffclass();
		d2.n3();
		d2.n4();
		
		
	}

}
