package Multiple_Interface_Implemenation_class;

public class multiple_Sample3 implements Test5,Test6
{
	public void m2()
	{
		System.out.println("method m1 is completed in implementation class");
		
	}
	
	public void m1()
	{
		System.out.println("method m2 is completed in implementation class");
		
	}
	
	public void m3()
	{
		System.out.println("method m3 is completed in implementation class");
		
	}
	
	public void m4()
	{
		System.out.println("method m4 is completed in implementation class");
		
	}
	public static void main(String[] args)
	{
		
		multiple_Sample3 s3=new multiple_Sample3();
		s3.m1();
		s3.m2();
		s3.m3();
		s3.m4();
	}

}
