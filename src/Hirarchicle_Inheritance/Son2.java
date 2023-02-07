package Hirarchicle_Inheritance;

public class Son2 extends Father
{
	public void Bike()
	{
		System.out.println("Honda");
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("---features of son2-----");
		
		Son2 s2=new Son2();
		s2.Bike();
		s2.car();
		s2.Money();

   System.out.println("----feature of son1-------------");
     
     Son1 s1=new Son1();
     s1.car();
     s1.Flat();
     s1.Money();
		
		
	}

}
