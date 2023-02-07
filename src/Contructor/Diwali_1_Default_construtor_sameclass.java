package Contructor;

public class Diwali_1_Default_construtor_sameclass 
{
	public void m1()
	{
		System.out.println("Running method m1 call from same class");
		
	}
	
	public void m2()
	{
		System.out.println("Running method m2 call from same class");
		
	}
	
	public static void main(String[] args) 
	{
		
		Diwali_1_Default_construtor_sameclass  d1=new Diwali_1_Default_construtor_sameclass ();
		d1.m1();
		d1.m2();
		
		
		Diwali_2_Default_construtor_diffClass d3=new Diwali_2_Default_construtor_diffClass();
		d3.m3();
		
	}

}
