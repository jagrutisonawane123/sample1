package Contructor;

public class Demo1_default_con 

{
	
	public void m1()
	{
		
		System.out.println("Running m1 method call from same class");
	}
	
	public void m2()
	{
		System.out.println("--------------------");
		
		System.out.println("Running m2 method call from same class");
		
		System.out.println("---------------");
	}

	
	public static void main(String[] args) 
 {
	 Demo1_default_con d1= new Demo1_default_con();
	 d1.m1();
	 d1.m2();
	 
	  
	 Demo_default_diff_con d2=new Demo_default_diff_con();
	 d2.m3();
}
}

