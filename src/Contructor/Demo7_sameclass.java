package Contructor;

public class Demo7_sameclass




{
	public void test1()
	{
		System.out.println("Running test1 same class");
		System.out.println("--------------------");
	}
	public void test2()
	{
		System.out.println("Runnin test2 same class");
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) 
	{
		Demo7_sameclass s1=new Demo7_sameclass();
		s1.test1();
		s1.test2();
		
		Demo8_diffclass s2=new Demo8_diffclass();
		s2.test3();
		
		
	}

}
