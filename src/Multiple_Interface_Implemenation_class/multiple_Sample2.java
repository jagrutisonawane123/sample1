package Multiple_Interface_Implemenation_class;

public class multiple_Sample2 implements Test3,Test4			
{

	public void k1()
	{
		System.out.println(" method k1 from test3 completed in implementation class");
		
	}
	public void k2()
	{
		System.out.println(" method k2 from test3 completed in implementation class");
		
	}
	public void k3()
	{
		System.out.println(" method k3 from test3 completed in implementation class");
		
	}
	public void k4()
	{
		System.out.println(" method k4 from test4 completed in implementation class");
		
	}
	public void k5()
	{
		System.out.println(" method k5 from test4 completed in implementation class");
		
	}
	public static void main(String[] args) 
	{
		multiple_Sample2 m1=new multiple_Sample2();
		m1.k1();
		m1.k2();
		m1.k3();
		m1.k4();
		m1.k5();
		
		
	}
}
