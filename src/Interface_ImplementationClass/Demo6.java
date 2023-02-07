package Interface_ImplementationClass;

public class Demo6 implements Demo5
{
	public void m1()
	{
		System.out.println("method m1 iscompleted in  implementation class ");
		
	}
     
	
	public void m2()
	{
		System.out.println("method m2 iscompleted in  implementation class ");
		
	}
	public void m3()
	{
		System.out.println("method m3 iscompleted in  implementation class ");
		
	}
	public static void main(String[] args)
	{
		Demo6 s6=new Demo6();
		s6.m1();
		s6.m2();
		s6.m3();
	}
}
