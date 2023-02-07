package conditionstatement;

public class Sample3_nested_if
{
	public static void main(String[] args) 
	{
		int SA=3500000;
		
		
		if (SA>=700)
		{
			System.out.println("no ather charge is required");
			
			if (SA>=300000)
			{
				System.out.println("Additional 20% Discount");
				
				if (SA>=1200000)
				{
					System.out.println("Additional 50% disscount");
				}
				else 
				{
					System.out.println("Not disscount");
				}
				
			}
			else
			{
				System.out.println("not additional discount is available");
			}
			
		}
		else
		{
			System.out.println("50% discount is available");
		}
	}

}
