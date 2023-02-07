package Casting;

public class Uncle extends Grandfather
{
	public void money()
	{
		System.out.println("money : 5lakh");
		
	}
	public void farm()
	{
		System.out.println("farm :3000sq feet");
		
	}
	public void plot() 
	{
		System.out.println("Plot :7000sq feet");
		
	}
	
	public static void main(String[] args) 
	{
		Grandfather f=new Uncle();
		f.farm();
		f.plot();
		
	}

}
