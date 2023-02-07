package Interface_ImplementationClass;

public class Diwali_Demo4 implements Diwali_Demo3
{
	public void n1()
	{
		System.out.println("method n1 is completed in implementattion class");
		
	}
	public void n2()
	{
		System.out.println("method n2 is completed in implementattion class");
		
	}
	public static void main(String[] args) 
	{
		Diwali_Demo4 d=new Diwali_Demo4 ();
		d.n1();
		
		d.n2();
		
	}

}
