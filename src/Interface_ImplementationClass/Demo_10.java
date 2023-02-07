package Interface_ImplementationClass;

public class Demo_10 implements Demo9
{
	
	public void l1()
	{
		System.out.println("method l1 is completed in implementetion class");
		
		
		System.out.println(i);
	}
	
	public void l2()
	{
		System.out.println("method l1 is completed in implementetion class");
		
	}
	public static void main(String[] args) 
	{
		Demo_10 d5=new Demo_10();
		d5.l1();
		d5.l2();
		
	}

}
