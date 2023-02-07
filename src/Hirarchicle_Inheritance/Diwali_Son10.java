package Hirarchicle_Inheritance;

public class Diwali_Son10 extends Diwali_Father 
{
	public void laptop()
	{
		System.out.println("Dell lappy");
		
	}
	public static void main(String[] args) 
	{
		System.out.println(".........fetires of son10.........");
		Diwali_Son10 d=new Diwali_Son10();
		d.car();
		d.Home();
		d.laptop();
		
		
		System.out.println(".......fetures of son9.......");
		Diwali_Son9 s=new Diwali_Son9();
		s.car();
		s.Home();
		s.Bike();
	}

}
