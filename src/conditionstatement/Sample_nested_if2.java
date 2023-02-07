package conditionstatement;

public class Sample_nested_if2 
{
	public static void main(String[] args) 
		
	{
	int PEM=450;
	if(PEM>=400)
	{
		System.out.println("student is eligible for main");
		
		int MEM=700;
		if(MEM>=600)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("rejected");
		}
	}
	else 
	{
		System.out.println("rejected");
	}
	

}
}
