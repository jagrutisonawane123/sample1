package Casting;

public class Diwali_Son3 extends Diwali_Father3
{
	public void Bike()
	{
		System.out.println("Hero Honda");
		
	}
	public void Home()
	
	{
		System.out.println("home : 3Bhk");
		
	}
	public void car() 
	{
		System.out.println("BMW");
		
	}
  public static void main(String[] args) 
{
	  Diwali_Father3 f= new Diwali_Son3();
	  f.Home();
	  f.car();
	 // f.Bike();
	
}
}
