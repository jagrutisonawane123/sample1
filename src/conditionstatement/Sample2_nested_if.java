package conditionstatement;

public class Sample2_nested_if 
{
	public static void main(String[] args) 
	{
		
		int SA=200;
		
		if (SA>=500)//outer if
		{
			System.out.println("no delivery charge applied");
			
			
			if (SA>=12000)//nested if
			{
				System.out.println("Additional 10% discount");
				
			}
			else
			{
				System.out.println("Not_Additional discunt");
			}
		}
		else
		{
			System.out.println("100rs dilivery charge applied");
		}
	}
	
}
