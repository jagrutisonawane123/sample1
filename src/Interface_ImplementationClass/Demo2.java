package Interface_ImplementationClass;

public class Demo2 implements Demo1
{
	public void m1()
	{
		System.out.println("method m1 is completed in implementation class");
		
	}
	public void m2()
	{
		System.out.println("method m2 is completed in implementation class");
		
	}
  
	
	public static void main(String[] args)
	{
		Demo2 d2=new Demo2();
		d2.m1();
		d2.m2();
		
	}
}
