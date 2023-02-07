package Casting;

public class Son2 extends Father2
{
	public void Laptop()
	{
		System.out.println("Hp laptop");
		
	}
	public void car() 
	{
		System.out.println("car : maruti suzuki");
		
	}
	public void farm() 
	{
		System.out.println("Farm : 2000 akar");
		
	}
	public static void main(String[] args)
	{
		Father2 f2=new Son2();
		f2.car();
		f2.farm();
		//f2.Laptop();
		
	}

}
