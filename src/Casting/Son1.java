package Casting;

public class Son1 extends Father1

{
	public void Bike() 
	{
		System.out.println("Bike : spelender");
		
	}
	public void Money() 
	{
		System.out.println("money : 2lakh");
		
	}
	public void car()
	{
		System.out.println("car : kia");
		
	}
	public void Home() 
	{
		System.out.println("home : 3bhk");
		
	}
	public static void main(String[] args) 
	{
		//create object of sub class wit the reference of super class
		
		Father1 f = new Son1(); //syntax of upcasting
		f.car();
		f.Home();
		f.Money();
		
	}

}
