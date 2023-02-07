package Contructor;

public class Demo3_sameclass 
{
	
	//Demo3_sameclass()contructor call
	//{
	//	//use==> to copy call members of class into the object
	//}
	
	
	public void k1()
	{
		System.out.println("Running k1");
	}
	
	public void k2()
	{
		
		System.out.println("Running k2");
		
		System.out.println("------------------------");
	}

	public static void main(String[] args)
	
	{
		Demo3_sameclass d1=new Demo3_sameclass();
		d1.k1();
		d1.k2();
		
		Demo4_diffclass d2=new Demo4_diffclass();
		d2.k3();
		d2.k4();
		
		
		
		
	}
}
