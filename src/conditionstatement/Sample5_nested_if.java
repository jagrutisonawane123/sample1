package conditionstatement;

public class Sample5_nested_if
{
	public static void main(String[] args)
	{
		int PEM=400;
		if (PEM>=300)
		{
			System.out.println("Eliible for mains exam");
			
			int MEM=700;
			if (MEM>=600)
			{
				System.out.println("Selected");
			}
			else
			{
				System.out.println(" mains Rejected");
			}
		}
		else
		{
			System.out.println("pre rejected");
		}
		
	}

}
