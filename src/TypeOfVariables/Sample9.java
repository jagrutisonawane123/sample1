
package TypeOfVariables;

public class Sample9 
{
	static int a=11;
	
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(Sample_10_static_var.b);
		System.out.println(Sample_10_static_var.b);
		System.out.println(Sample_10_static_var.b);
		System.out.println(Sample_10_static_var.b);
		test1();
		test1();
		test1();
		test1();
		Sample9 d1=new Sample9();
		d1.test2();
		

	}
	public static void test1()
	{
		System.out.println(a);
		
	}
	
	 public void test2()
	 {
		 System.out.println(a);
	 }

}
