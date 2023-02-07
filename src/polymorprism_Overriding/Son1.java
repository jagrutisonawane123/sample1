package polymorprism_Overriding;

public class Son1  extends Father1
{
	public void Bike()
	{
		System.out.println("Bike :::FZ V3");
		
	}
	public void money() 
	{
		System.out.println("money ::: 3lakh");
		
	}
    public static void main(String[] args)
    {
    	Son1 s =new Son1();
    	s.Bike();
    	s.car();
    	s.home();
    	s.money();
    	
		
	}
}
