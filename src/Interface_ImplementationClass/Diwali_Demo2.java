package Interface_ImplementationClass;

public class Diwali_Demo2 implements Diwali_Demo1
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
		Diwali_Demo2 d=new Diwali_Demo2();
		d.m1();
		d.m2();
		
	}

}
