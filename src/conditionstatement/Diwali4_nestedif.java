package conditionstatement;

public class Diwali4_nestedif 
{
	public static void main(String[] args)
	{
		
	
	int PEM=500;
	if(PEM>=400)
	
	{
		System.out.println("primary exam pass");
		int markss=800;
		
		if(markss>=600)
		{
			System.out.println("mains selected");
		}
		else
		{
			System.out.println("Rejected");
		}
		
	
	}
	else
	{
		System.out.println("pri exam rejected");
	}
	}
}
