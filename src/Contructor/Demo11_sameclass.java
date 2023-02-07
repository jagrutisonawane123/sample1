package Contructor;

public class Demo11_sameclass
{
	
	public void test1()
	{
		System.out.println("Runnig test1 from same class");
		System.out.println("----------------------------");
	}
	public void test2()
	{
		System.out.println("Runnig test2 from same class");
		System.out.println("==============================");
	}

	public void test3()
	{
		System.out.println("Runnig test3 from same class");
		System.out.println("=============================");
	}

public static void main(String[] args)
{
	Demo11_sameclass s1=new Demo11_sameclass();
	s1.test1();
	s1.test2();
	s1.test3();
	
	Demo12_diffclass  s2=new Demo12_diffclass();
	s2.test5();
	s2.test6();

	
	
}
}
