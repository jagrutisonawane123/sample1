package Single_Level_Inheritance;

public class Son1 extends  Father1
{
	public void car() 
	{
		System.out.println("maruti Suzuki");
		
	}
	public static void main(String[] args)
	{
		Son1 s2=new Son1();
		s2.car();
		s2.Travel();
		s2.Farm();
		
	}

}
