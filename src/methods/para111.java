package methods;

public class para111 
{
	public static void main(String[] args)
	
	{
		test(12,14,13);
		test(12,12,12);
		test (44,55,44);
		
		
		
		
		para111 p1=new para111();
		p1.test1(6,7,8);
		p1.test1(12,12,44);
		
		
		
	}
	
	public static void test(int a,int b,int c)
	{
		System.out.println("Running static program call from same class");
	   System.out.println(a+b+c);
	
	}
	
	public void test1(int m1,int m2,int m3)
	{
		System.out.println(m1*m2+m3);
		
	}
}
