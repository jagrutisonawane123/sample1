package polymorprism_Overriding;

public class Son2 
{
	public void Bike() 
	{
		System.out.println("Hero honda");
	}
	
	public void farm()
	{
		System.out.println("Farm:::1000sq feet");
	}
	public static void main(String[] args) 
	{
		Son2 s2=new Son2();
		s2.Bike();
		s2.farm();
	}

}
