package Hirarchicle_Inheritance;

public class Son5 extends Father2
{
public void Laptop()
{
	System.out.println("HP");
	
}
public static void main(String[] args)
{
	System.out.println("-feature of son5----");
	Son5 s5=new Son5();
	s5.Laptop();
	s5.Home();
	s5.farm();
	
	System.out.println("---Feature of son4---");
	Son4 s4=new Son4();
	s4.For_Wheeler();
	s4.farm();
	s4.Home();
	
	System.out.println("---Feature of son3---");
	Son3 s3=new Son3();
	s3.Bike();
	s3.farm();
	s3.Home();
}
}
