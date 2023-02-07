package Casting;

public class Diwali_Son4 extends Diwali_Father4
{
	//private void laptop()
	//{
	//	System.out.println("laptop Hp");
		
	//}
	public void car() 
	{
		System.out.println("Maruti Suzuki");
		
	}
	public void Gold() 
	{
		System.out.println("20 gm");
		
	}
	public static void main(String[] args)
	{
		Diwali_Father4 d=new Diwali_Son4();
		d.Car();
		d.Gold();		
	}

}
