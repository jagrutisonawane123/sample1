package conditionstatement;

public class Sample_nested_if 
{public static void main(String[] args)
{
	int premarks=500;
	
	if (premarks>=300)//outer if
	{
		System.out.println("Student is applied for main");
		int mainmarks=790;
		
		if (mainmarks>=700)//nested if
		{
			System.out.println("Student is applied for interview");
			float intpoint=60.00f;
			
			if (intpoint>=50.00)//nested if
			{
				System.out.println("Congratulation student is selected SBI bank for PO position ");
				
			}
			else
			{
				System.out.println("Rejected at all");
			}
			
		}
		else
		{
			System.out.println("Student is not applicable for interview");
			
			
		}
		
		
	}
	else
	{
		System.out.println("Student is Rejected");
	}
	
}

}
